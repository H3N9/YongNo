package youngNo.register.model;

public class Finance {
	private Student student;
	private Course course;
	private double money;
	private double cost;
	private String status;
	public static int id;
	
	public Finance(Student student, Course course, double money, double cost, String status) {
		this.money = money;
		this.course = course;
		this.money = money;
		this.setCost(cost);
		this.setStatus(status);
		Finance.id++;
	}
	
	public Finance(Student student, Course course, double money, double cost) {
		this.money = money;
		this.course = course;
		this.money = money;
		this.setCost(cost);
		this.setStatus();
		Finance.id++;
	}
	
	public void setStatus() {
		if (this.cost <= money) {
			setStatus("Pass");
		}
		else if(cost > money) {
			setStatus("Not enough");
		}
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
