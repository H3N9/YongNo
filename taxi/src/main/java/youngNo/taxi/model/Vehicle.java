package youngNo.taxi.model;

public class Vehicle extends Model{
	private String name;
	private int speed;
	private String brand;
	protected static int count=0;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String brand, int speed) {
		super();
		this.name = name;
		this.setBrand(brand);
		this.speed = speed;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
