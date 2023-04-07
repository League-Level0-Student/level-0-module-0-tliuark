package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		String intro = JOptionPane.showInputDialog("This is a fun math quiz."
				+ "See how much score you can get! Enjoy!");
		JOptionPane.showMessageDialog(null,intro);
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog("What is 27 squared?");
				// 2.  Ask the user a question 
			if (question.equals("729")) {
			 score += 1;
			}else {
				score -= 1;
			}
				// 3.  Use an if statement to check if their answer is correct
			String question2 = JOptionPane.showInputDialog("What is 2 to the seventh power?");
		if (question2.equals("128")) {
		 score += 1;
		}else {
			score -= 1;
		}
		String question3 = JOptionPane.showInputDialog("What's 11 cubed?"); 
	if (question3.equals("1331")) {
	 score += 1;
	}else {
		score -= 1;
	}
	String question4 = JOptionPane.showInputDialog("What's 53 times 47?"
			+ "This is an extra credit question. If you want a hint, type hint."); 
	if (question4.equals("2491")) {
	 score += 2;
	}
	else if(question4.equalsIgnoreCase("hint"))
	{String hint =  "Try to use the square difference formula.";
	JOptionPane.showMessageDialog(null,hint);
	String question4withhint = JOptionPane.showInputDialog("What's 53 times 47?");
		if(question4withhint.equals("2491")) {
			score += 1;
		}else {
				score -= 1;
			}
		
		}else {
		score -= 0;
	}
				// 4.  if the user's answer was correct, add one to their score 
			JOptionPane.showMessageDialog(null, "your score is"+score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
