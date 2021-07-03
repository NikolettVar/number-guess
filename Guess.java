/*
*Guess.java
*N Varadi
*4 11 2020
*/

import java.lang.Math.*;

public class Guess{


	private int guess;
	private String message;
	private int rNo;

	public Guess(){
	rNo = (int)(Math.random()*10);
	guess = 0;
	message = "";
	}

	public void setGuess(int guess){
		this.guess = guess;
	}

	public void compute(){
		if(guess == rNo){
			message = "Congratulations, you guessed correctly";
		}
		else if(guess < rNo){
			message = "Your guess is too low";
		}
		else{
			message = "Your guess is too high";
		}
	}

	public String getMessage(){
		return message;
	}

	public int getRandom(){
		return rNo;
	}
}