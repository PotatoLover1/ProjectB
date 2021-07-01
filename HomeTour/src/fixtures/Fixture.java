package fixtures;

public abstract class Fixture {
	private String name;
	private String sDesc;
	private String lDesc;
	
	//Constuctor
	public Fixture(String name, String sDesc, String lDesc) {
		super();
		this.name = name;
		this.sDesc = sDesc;
		this.lDesc = lDesc;
	}
	
	//Getters and Setters for the private variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsDesc() {
		return sDesc;
	}

	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}

	public String getlDesc() {
		return lDesc;
	}

	public void setlDesc(String lDesc) {
		this.lDesc = lDesc;
	}
	


}
