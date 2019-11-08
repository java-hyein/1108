import java.io.Serializable;
public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8452892506503869585L;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	

	private String firstName;
	
	private String LastName;
}
