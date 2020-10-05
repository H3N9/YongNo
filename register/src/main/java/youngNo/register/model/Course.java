package youngNo.register.model;

import java.util.ArrayList;

public class Course {
	private String id;
	private String title;
	private Lecturer lecturer;
	private ArrayList<Student> students;
	public Course(String id, String title, Lecturer lecturer) {
		super();
		this.id = id;
		this.title = title;
		this.lecturer = lecturer;
		this.students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void addStudent(ArrayList<Student> students) {
		this.students.addAll(students);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	
}
