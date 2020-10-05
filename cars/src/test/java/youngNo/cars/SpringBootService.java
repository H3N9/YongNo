package youngNo.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootService {
	public int count;
	public HashMap<String, JsonNode> cars;
	public LinkedList<Car> listCar;
	
	public SpringBootService() {
		count = 0;
		cars = new HashMap<String, JsonNode>();
		listCar = new LinkedList<Car>();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootService.class, args);
	}
	@RequestMapping(value = "/page1", method = RequestMethod.POST)
	public String hello(@RequestBody Object object) {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = "error";
		try {
			json = ow.writeValueAsString(object);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode actualObj = mapper.readTree(json);
	
			JsonNode list = actualObj.get("list");
			String name = actualObj.get("name").asText();
			int index = actualObj.get("index").asInt();
			return String.format("{\"payload\":\"%s\"} \n"
					+ "Your name is %s\n"
					+ "You get the element at index %d\n"+"%s", actualObj, name,index,list.get(index));
		} 
		catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			return "Error\nschema is {\"name\":String, \"list\":Array, \"index\":int}\n"
					+ "example : {\"name\": \"youngNo\", \"list\": [\"pooh\", 3, true, 5.33], \"index\": 2}";
		}
		return String.format("%s", json);
		//return String.format("{\"payload\":\"%s\"}", json);
	}

	
	@RequestMapping(value = "/car" , method = RequestMethod.POST)
	public ResponseEntity<LinkedList<Car>> create(@RequestBody LinkedList<Car> list) {
		//listCar.addAll(cars);
		list.stream().forEach(action -> listCar.add(action));
		return new ResponseEntity<LinkedList<Car>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{index}", method = RequestMethod.DELETE)
	public ResponseEntity<LinkedList<Car>> carDelete(@PathVariable("index") int index) {
		Car car = listCar.get(index-1);
		listCar.remove(index-1);
		return new ResponseEntity<LinkedList<Car>>(new LinkedList<Car>(Arrays.asList(car)), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{index}", method = RequestMethod.PATCH)
	public ResponseEntity<LinkedList<Car>> carUpdate(@RequestBody Car datacar,@PathVariable("index") int index) {
		listCar.set(index-1, datacar);
		return new ResponseEntity<LinkedList<Car>>(listCar, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/car/{index}", method = RequestMethod.GET)
	public ResponseEntity<Car> carGet(@PathVariable("index") int index) {
		Car car = listCar.get(index-1);
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public ResponseEntity<LinkedList<Car>> getHello() {
		return new ResponseEntity<LinkedList<Car>>(listCar, HttpStatus.OK);
	}
}