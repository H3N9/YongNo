package youngNo.register;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import youngNo.register.model.*;

@RestController
public class HelloController {
	private ArrayList<Student> students;
	
	public HelloController() {
		this.students = new ArrayList<Student>();
		this.students.add(new Student("1", "youngNo", "eee", "IT"));
		this.students.add(new Student("2", "ppoh", "ees", "EN"));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/student")
	public ResponseEntity<ArrayList<Student>> getAllStudent(){
		return new ResponseEntity<ArrayList<Student>>(students, HttpStatus.OK);
	}
	
}
