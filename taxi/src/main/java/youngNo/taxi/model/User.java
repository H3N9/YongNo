package youngNo.taxi.model;

public class User extends Model{
	private String name;
	private int phone;
	private String location;
	protected static int count=0;
	
	public User() {
		
	}
	
	public User(String name, String location, int phone) {
		super();
		this.setName(name);
		this.setLocation(location);
		this.setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
