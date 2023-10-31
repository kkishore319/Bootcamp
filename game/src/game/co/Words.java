package game.co;

import java.util.Random;

public class Words {
	
	 private String selectedword;
	private String[] randomwords= {"files", "comet", "rapid", "teams","super",
			"train", "camera", "mobile","patrick","realme","pilot", "laptop",
			"book", "drink", "capgemini", "window","return", "guess","magic","ice cream"};
	
	
	private Random r= new Random();
	private char[] letters;
	
	public Words() {
		selectedword = randomwords[r.nextInt(randomwords.length)];
		letters= new char[selectedword.length()];
	}

	
	public String toString() {
		StringBuilder word= new StringBuilder();
		
		
		
		for( char letter :letters) {
			
			word.append(letter=='\u0000'?"-":letter);
			
			word.append(" ");
			
		}
		
		
		return word.toString();
	}


	public boolean guess(char letter) {
		boolean guessedright=false;
		
		for ( int i=0;i<selectedword.length();i++) {
			if (letter== selectedword.charAt(i)) {
				letters[i]=letter;
				guessedright=true;
				
			}
		}
		return guessedright;
	}
	
	public boolean isGuessedRight() {
		for (char letter :letters) {
			if (letter=='\u0000') {
				return false;
			}
		}
		
		return true;
		
	}


	/**
	 * @return the selectedword
	 */
	public String getSelectedword() {
		return selectedword;
	}


	/**
	 * @param selectedword the selectedword to set
	 */
	public void setSelectedword(String selectedword) {
		this.selectedword = selectedword;
	}

}
