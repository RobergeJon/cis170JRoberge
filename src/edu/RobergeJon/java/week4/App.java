package edu.RobergeJon.java.week4;
// multiple games
//logic code

<<<<<<< HEAD
import java.util.Scanner;

public class App {
	public static String[] wordBank = {"Horse", "Cow", "Java", "Computer", "Code", "Eclipse" };
	public static String word = wordBank[(int) (Math.random() * wordBank.length)];
	public static String[] hintBank = {"hay","Moo","Language","electronic","Java","CodingSoftware" };
	public static String gameMask = new String(new char[word.length()]).replace("\0", "*");
	public static int wrongGuess = 0;
		
=======
import CarHW.Car;

public class App {

	public static void main(String[] args) {
		
		Games g1 = new Games();
		g1.setGameWord("Horse");
>>>>>>> b67bf6aa5c68208b41f39867730d16d2fc5cb3c9
	
	
	}
		
<<<<<<< HEAD

=======
}
>>>>>>> b67bf6aa5c68208b41f39867730d16d2fc5cb3c9
	
	
	
