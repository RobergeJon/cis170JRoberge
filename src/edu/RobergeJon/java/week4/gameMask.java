package edu.RobergeJon.java.week4;

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
	
		
}

	
	
	
	
