package youngNo.taxi.model;

public class Driver extends Model{
	private String phone;
	private String location;
	private Vehicle vehicle;
	private String status;
	protected static int count=0;
	
	public Driver() {
		
	}

	public Driver(String phone, String location, Vehicle vehicle, String status) {
		super();
		this.phone = phone;
		this.location = location;
		this.vehicle = vehicle;
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
