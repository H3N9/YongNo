package youngNo.register.model;

public class Grade {
	private Student student;
	private Course course;
	private int score;
	private String grade;
	public static int id;
	
	public Grade(Student student, Course course, int score, String grade) {
		this.student = student;
		this.course = course;
		this.score = score;
		this.grade = grade;
		Grade.id++;
	}
	
	public Grade(Student student, Course course, int score, int a, int b, int c, int d) {
		this.student = student;
		this.course = course;
		this.score = score;
		setGradeWithScore(a, b, c, d);
		Grade.id++;
	}
	
	
	public void setGradeWithScore(int a, int b, int c, int d) {
		if(score>=a && score <= 100) {
			setGrade("A");
		}
		else if(score>=b) {
			setGrade("B");
		}
		else if(score>=c) {
			setGrade("C");
		}
		else if(score>=d) {
			setGrade("D");
		}
		else if(score>=0) {
			setGrade("F");
		}
		else{
			setGrade("Error");
		}
	}
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
