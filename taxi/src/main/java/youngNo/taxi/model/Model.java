package youngNo.taxi.model;

public class Model {
	private String id;
	protected static int count=0;
	
	
	public Model() {
		int id = ++count;
		this.id = String.valueOf(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
