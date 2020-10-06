package youngNo.taxi;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import youngNo.taxi.model.*;;

@RestController
public class TaxiController {
	private HashMap<String, Vehicle> vehicles;
	private ArrayList<User> users;
	private HashMap<String, Driver> drivers;
	
	public TaxiController() {
		this.vehicles = new HashMap<String, Vehicle>();
		this.users = new ArrayList<User>();
		this.drivers = new HashMap<String, Driver>();
		Vehicle vehicle1 = new Vehicle("lower", "ccc", 200);
		Vehicle vehicle2 = new Vehicle("faster", "kkkk", 200000);
		
		this.vehicles.put(vehicle1.getId(), vehicle1);
		this.vehicles.put(vehicle2.getId(), vehicle2);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/vehicle")
	public ResponseEntity<HashMap<String, Vehicle>> getAllVehicle(@RequestBody Vehicle vehicle){
		this.vehicles.put(vehicle.getId(), vehicle);
		return new ResponseEntity<HashMap<String, Vehicle>>(vehicles, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/taxi/vehicle")
	public ResponseEntity<HashMap<String, Vehicle>> addVehicle(){
		return new ResponseEntity<HashMap<String, Vehicle>>(vehicles, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/vehicle/{index}")
	public ResponseEntity<Vehicle> getVehicle(@PathVariable("index") String key){
		return new ResponseEntity<Vehicle>(vehicles.get(key), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/user")
	public ResponseEntity<ArrayList<User>> getAllUser(){
		return new ResponseEntity<ArrayList<User>>(users, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/driver")
	public ResponseEntity<HashMap<String, Driver>> getAllDriver(){
		return new ResponseEntity<HashMap<String, Driver>>(drivers, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/taxi/driver")
	public ResponseEntity<HashMap<String, Driver>> addDriver(@RequestBody DriverForm form){
		Driver driver = new Driver(form.getPhone(), form.getLocation(), vehicles.get(form.getVehicleId()), form.getStatus());
		this.drivers.put(driver.getId(), driver);
		return new ResponseEntity<HashMap<String, Driver>>(drivers, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/driver/{index}")
	public ResponseEntity<Driver> getDriver(@PathVariable("index") String key){
		return new ResponseEntity<Driver>(drivers.get(key), HttpStatus.OK);
	}

}
