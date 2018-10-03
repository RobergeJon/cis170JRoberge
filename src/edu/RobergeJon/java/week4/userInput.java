package edu.RobergeJon.java.week4;

public class userInput {
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

}





//Apply Input