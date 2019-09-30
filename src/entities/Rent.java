package entities;

public class Rent {
	
	private String name;
	private String email;
	
	// It's  Constructor 
	public Rent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	//It's Accessor methods

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + "," + email;
	}

}
