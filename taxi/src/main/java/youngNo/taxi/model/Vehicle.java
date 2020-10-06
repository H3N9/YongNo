package youngNo.taxi.model;

public class Vehicle {
	private String id;
	private String name;
	private int speed;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String id, String name, int speed) {
		super();
		this.id = id;
		this.name = name;
		this.speed = speed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
