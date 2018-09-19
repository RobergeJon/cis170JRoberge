
public class User {

	private String userName;
	private String email;
	private String FirstName;
	private String LastName;
	
	/* Method signature consists of....
	 * Accessor- public,private or protected
	 * Return Type - Any Type or void for nothing
	 * Method name - make it good so people know what the method does
	 * Argument list - parameters passed to the method */
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	
}
