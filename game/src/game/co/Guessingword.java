package game.co;

import java.util.Scanner;

public class Guessingword {

	private boolean play = true;
	private Scanner sc= new Scanner(System.in);
	private char lastround;
	
	
	Words random= new Words();
	private int rounds=random.getSelectedword().length()+3;
	
	
	public void start() {

		do {
			showtheword();
			giveinput();
			checkinput();
		} while (play);
	}

	public void showtheword() {
		System.out.println("You have "+rounds+" tries more");
		System.out.println(random);
	}

	public void giveinput() {
		System.out.print("Guess the word :");
		String userguess= sc.nextLine();
		lastround=userguess.charAt(0);

	}

	public void checkinput() {
		
		boolean guessedright= random.guess(lastround);
		
		if(guessedright) {
		if(random.isGuessedRight()) {
			System.out.println("congrats! you are done");
			System.out.println("You're word is "+random);
			play =false;
		}}
		else {
			rounds--;
			if (rounds==0) {
			System.out.println("Game over! you are done");
			System.out.println("word is "+random.getSelectedword());
			play=false;
		}}
		
	}

	public void end() {
		sc.close();
		
		
	}

}
