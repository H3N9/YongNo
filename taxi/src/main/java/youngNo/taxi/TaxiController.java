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
	
	public TaxiController() {
		this.vehicles = new HashMap<String, Vehicle>();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/taxi/vehicle")
	public ResponseEntity<HashMap<String, Vehicle>> getAllVehicle(){
		return new ResponseEntity<HashMap<String, Vehicle>>(vehicles, HttpStatus.OK);
	}
}
