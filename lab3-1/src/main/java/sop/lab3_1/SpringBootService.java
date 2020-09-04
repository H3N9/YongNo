package sop.lab3_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootService {
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
	@RequestMapping(value = "/Hello", method = RequestMethod.GET)
	public String getHello() {
		return "hello";
	}
}