
import java.util.Scanner;
public class IntPrinter {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number:   ");
		int number = reader.nextInt();
		System.out.println(" You Entered: " + number);
		
		System.out.println("Enter your Name:  ");
		Scanner name = new Scanner(System.in);
		String username = name.nextLine();
		System.out.println("Your name is " + username);
		
		
	}
	
	
}
