package edu.RobergeJon.java.week4;

<<<<<<< HEAD
import java.util.Scanner;

public class gameMask {
	public App() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (wrongGuess < 10 && gameMask.contains("*")) {
			System.out.println("Guess a Letter");
			System.out.println(gameMask);
			String wrongGuess = sc.next();
			hang(wrongGuess);
		}
		sc.close();
	}
=======
public class gameMask {
	private String gameWord;
	
	
	public String getGameWord() {
		return gameWord;
	}
	
	
	
	
	

		public void createMask() {
		
			String word = gameWord;
		
			for(int i = 0; i < word.length(); i++) {
			
				System.out.println("*");
			}
		}
	
>>>>>>> b67bf6aa5c68208b41f39867730d16d2fc5cb3c9
		
}

	
	
	
	
