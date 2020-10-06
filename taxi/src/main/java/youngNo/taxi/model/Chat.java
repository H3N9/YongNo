package youngNo.taxi.model;

public class Chat extends Model{
	private User user;
	private Driver driver;
	private String text;
	protected static int count=0;
	
	public Chat() {
		
	}

	public Chat(User user, Driver driver, String text) {
		super();
		this.user = user;
		this.driver = driver;
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
}
