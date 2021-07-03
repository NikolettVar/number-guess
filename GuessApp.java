/*
*GuessApp.java
*N Varadi
*4 11 2020
*/

import javax.swing.JOptionPane;

public class GuessApp{
	public static void main(String args[]){

	int guess;
	String message;
	int rNo;


	Guess myGuess;
	myGuess = new Guess();

	guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your guess"));
	myGuess.setGuess(guess);

	myGuess.compute();

	message = myGuess.getMessage();
	JOptionPane.showMessageDialog(null, message);

	rNo = myGuess.getRandom();
	JOptionPane.showMessageDialog(null, "The secret number was: " + rNo);


	}
}
