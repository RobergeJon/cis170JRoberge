// Namespace - keeps objects unique
// translate to a folder
// helps you orginize 'like' code


// package defaultPackage;

public class App {
// App is the entry point to our application
	
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setFirstName("George");
		u1.setLastName("John");
		u1.setEmail("george@john.com");
		u1.setUserName("gJohn");
		
		User u2 = new User();
		u2.setFirstName("Bill");
		u2.setLastName("Nye");
		u2.setEmail("billnye@gmail.com");
		u2.setUserName("ScienceGuy");
		
		User u3 = new User();
		u3.setFirstName("Jonathan");
		u3.setLastName("Roberge");
		u3.setEmail("sjonathanroberge@yccc.edu");
		u3.setUserName("JonRob");
		
		System.out.println(u1.getEmail());
		System.out.println(u2.getFirstName());
		
		// for loop
		for(int x = 0; x < 100; x++) {
			
			// Hang Man Code Steps
		
			
			//prompt user to guess a letter
			//prompt user with mask of word( recalculate mask)
			//prompt user with hint
			// Collect User input
			//repeat....
			
			System.out.println(x);
			
		} // increment counter
		
		
		
		
	}
	// ask mike how the heck to do this
	private void generateMask() {
		
		
		
	}
	
	
	
}
