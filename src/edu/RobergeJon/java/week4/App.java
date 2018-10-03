package edu.RobergeJon.java.week4;
// multiple games
//logic code

import java.util.Scanner;

public class App {
	public static String[] wordBank = {"Horse", "Cow", "Java", "Computer", "Code", "Eclipse" };
	public static String word = wordBank[(int) (Math.random() * wordBank.length)];
	public static String[] hintBank = {"hay","Moo","Language","electronic","Java","CodingSoftware" };
	public static String gameMask = new String(new char[word.length()]).replace("\0", "*");
	public static int wrongGuess = 0;
		
	
	
	}
		

	
	
	
