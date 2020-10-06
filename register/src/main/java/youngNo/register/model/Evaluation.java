package youngNo.register.model;

import java.util.HashMap;

public class Evaluation {
	private Lecturer lecturer;
	private Student student;
	private String evaluate;
	public static int id;
	
	public Evaluation(Lecturer lecturer, Student student, String evaluate) {
		this.lecturer = lecturer;
		this.student = student;
		this.evaluate = evaluate;
		Evaluation.id++;
	}
	public Evaluation(String stu_id, String lec_id, String evaluate, HashMap<String, Lecturer> lecturers,HashMap<String,Student> students) {
		this(lecturers.get(lec_id), students.get(stu_id), evaluate);
	}
	
	public Lecturer getLeturere() {
		return lecturer;
	}
	public void setLeturere(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	
	
	
	
	
}
