package youngNo.register.model;

import java.util.ArrayList;

public class CourseForm {
	private String id;
	private String title;
	private int lecturer;
	private ArrayList<Integer> students;
	
	public CourseForm() {
		
	}
	
	public CourseForm(String id, String title, int lecturer, ArrayList<Integer> students) {
		super();
		this.id = id;
		this.title = title;
		this.lecturer = lecturer;
		this.students = students;
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

	public int getLecturer() {
		return lecturer;
	}

	public void setLecturer(int lecturer) {
		this.lecturer = lecturer;
	}

	public ArrayList<Integer> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Integer> students) {
		this.students = students;
	}
	
}
