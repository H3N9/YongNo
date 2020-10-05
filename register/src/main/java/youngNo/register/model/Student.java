package youngNo.register.model;

public class Student {
	private String id;
	private String firstName;
	private String lastName;
	private String faculty;
	
	public Student() {
		
	}
	
	public Student(String id, String firstName, String lastName, String faculty) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.faculty = faculty;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
