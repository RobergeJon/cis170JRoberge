package edu.RobergeJon.java.week4;

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
		
}

	
	
	
	
