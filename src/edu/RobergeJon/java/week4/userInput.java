package edu.RobergeJon.java.week4;

public class userInput {
<<<<<<< HEAD
	public static void hang(String userGuess) {
		String newgameMask = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == userGuess.charAt(0)) {
				newgameMask += userGuess.charAt(0);
			} else if (gameMask.charAt(i) != '*') {
				newgameMask += word.charAt(i);
			} else {
				newgameMask += "*";
			}
		}

		if (gameMask.equals(newgameMask)) {
			count++;
			hangmanCounter();
		} else {
			gameMask = newgameMask;
		}
		if (gameMask.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}
=======
>>>>>>> b67bf6aa5c68208b41f39867730d16d2fc5cb3c9

}





//Apply Input