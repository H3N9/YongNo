package youngNo.register;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import youngNo.register.model.*;

@RestController
public class HelloController {
	private ArrayList<Student> students;
	private ArrayList<Course> courses;
	private ArrayList<Lecturer> Lecturers;
	
	public HelloController() {
		this.students = new ArrayList<Student>();
		this.students.add(new Student("1", "youngNo", "eee", "IT"));
		this.students.add(new Student("2", "ppoh", "ees", "EN"));
		
		this.Lecturers = new ArrayList<Lecturer>();
		this.Lecturers.add(new Lecturer("1", "savage", "lasa"));
		this.Lecturers.add(new Lecturer("2", "prayet", "chan"));
		
		this.courses = new ArrayList<Course>();
		this.courses.add(new Course("1", "SOP", Lecturers.get(0)));
		this.courses.get(0).addStudent(students.get(0));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/student")
	public ResponseEntity<ArrayList<Student>> getAllStudent(){
		return new ResponseEntity<ArrayList<Student>>(students, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/student/{index}")
	public ResponseEntity<Student> getStudent(@PathVariable("index") int index){
		return new ResponseEntity<Student>(students.get(index), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/course")
	public ResponseEntity<ArrayList<Course>> getAllCourse(){
		return new ResponseEntity<ArrayList<Course>>(courses, HttpStatus.OK);
	}
	
}
