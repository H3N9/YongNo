package youngNo.register;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import youngNo.register.model.*;

@RestController
public class HelloController {
	private HashMap<String,Student> students;
	private HashMap<String, Finance> finances;
	private HashMap<String, Lecturer> lecturers;
	private HashMap<String, Grade> grades;
	private HashMap<String, Course> courses;
	private HashMap<String, Evaluation> evaluates;
	
	public HelloController() {
		this.students =  new HashMap<String,Student>();
		this.courses = new HashMap<String, Course>();
		this.grades = new HashMap<String, Grade>();
		this.lecturers = new HashMap<String, Lecturer>();
		this.finances = new HashMap<String, Finance>();
		this.evaluates = new  HashMap<String, Evaluation>();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/student")
	public ResponseEntity<HashMap<String, Student>> getAllStudent(){
		return new ResponseEntity<HashMap<String, Student>>(students, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	public ResponseEntity<HashMap<String, Student>> addStudent(@RequestBody Student student){
		String key = ((String) student.getId());
		this.students.put(key, student);
		return new ResponseEntity<HashMap<String, Student>>(this.students, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/student/{index}")
	public ResponseEntity<Student> getStudent(@PathVariable("index") String index){
		return new ResponseEntity<Student>(students.get(index), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/course")
	public ResponseEntity<HashMap<String, Course>> getAllCourse(){
		return new ResponseEntity<HashMap<String, Course>>(courses, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register/course")
	public ResponseEntity<HashMap<String, Course>> addCourse(@RequestBody CourseForm courseForm){
		Course course = new Course(courseForm.getId(), courseForm.getTitle(), lecturers.get(courseForm.getLecturer()));
		//ArrayList students = courseForm.getStudents();
		//students.stream().forEach(action -> this.courses.add(this.students.get(action)));
		
		this.courses.put((String)course.getId(), course);
		return new ResponseEntity<HashMap<String, Course>>(courses, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/lecturer")
	public ResponseEntity<HashMap<String, Lecturer>> getAllLecturer(){
		return new ResponseEntity<HashMap<String, Lecturer>>(lecturers, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register/lecturer")
	public ResponseEntity<HashMap<String, Lecturer>> addLecturer(@RequestBody Lecturer lecturer){
		this.lecturers.put((String)lecturer.getId(), lecturer);
		return new ResponseEntity<HashMap<String, Lecturer>>(lecturers, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/lecturer/{index}")
	public ResponseEntity<Lecturer> getLecturer(@PathVariable("index") String index){
		return new ResponseEntity<Lecturer>(lecturers.get(index), HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/register/lecturer")
	public ResponseEntity<HashMap<String, Evaluation>> addEvaluate(@RequestBody Evaluation evaluate){
		String key = ((String) evaluate.id);
		this.evaluates.put(key, evaluate);
		return new ResponseEntity<HashMap<String, Lecturer>>(lecturers, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/register/lecturer/{index}")
	public ResponseEntity<Lecturer> getLecturer(@PathVariable("index") String index){
		return new ResponseEntity<Lecturer>(lecturers.get(index), HttpStatus.OK);
	}
}
