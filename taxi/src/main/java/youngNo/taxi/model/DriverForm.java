package youngNo.taxi.model;

public class DriverForm{
	private String vehicleId;
	private String phone;
	private String location;
	private String status;
	
	
	public DriverForm() {
		
	}

	public DriverForm(String vehicleId, String phone, String location, String status) {
		super();
		this.vehicleId = vehicleId;
		this.phone = phone;
		this.location = location;
		this.status = status;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
