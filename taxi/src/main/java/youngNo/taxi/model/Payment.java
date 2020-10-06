package youngNo.taxi.model;

public class Payment extends Model{
	private float amout;
	private String account_number;
	private Driver driver;
	protected static int count=0;
	
	public Payment() {
		
	}

	public Payment(float amout, String account_number, Driver driver) {
		super();
		this.amout = amout;
		this.account_number = account_number;
		this.driver = driver;
	}

	public float getAmout() {
		return amout;
	}

	public void setAmout(float amout) {
		this.amout = amout;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
}
