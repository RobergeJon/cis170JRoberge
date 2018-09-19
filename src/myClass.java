
public class myClass {

	private String name = "Jon";
	private String lastName = "Roberge";
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Hello Human");
		System.out.println("Welcome to my program");
		
		//allows you to call method defined below
		myClass mc = new myClass();
		mc.sayHello();
	
		
	}
	
	// this method says hello when called
	private void sayHello() {
		
		
		System.out.println("Hello World");
		
		
	}
	
	
}
