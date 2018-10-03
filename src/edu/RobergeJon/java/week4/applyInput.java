package edu.RobergeJon.java.week4;

public class applyInput {
	
	 static void hangmanCounter() {
		
		if (wrongGuess > 9) {
			System.out.println("Wrong guess, try again");
		}
		if (wrongGuess == 9) {
			System.out.println("Wrong guess, try again");
			System.out.println("One more Guess! Be Careful");
		}
		if (wrongGuess == 10) {
			System.out.println("GAME OVER!");
			System.out.println("The word was " + word);
		}
	}
}

}
