package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String question = JOptionPane.showInputDialog("Do you know how to write codes?");
		// 2. If they say "yes", tell them they will rule the world.
		if(question.equalsIgnoreCase("yes") ||  question.equalsIgnoreCase("yep")) {
			JOptionPane.showMessageDialog(null, "If what you say is true,"
					+ "you will rule the world.");
		}else {
			JOptionPane.showMessageDialog(null,"Then what are you waiting for? "
					+ "Sign up for classes of the League of Amazing programers!");	
		}
		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

