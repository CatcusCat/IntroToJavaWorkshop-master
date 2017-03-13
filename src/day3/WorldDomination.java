package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String wri = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (wri.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!!");

		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Have fun with the dishes!! HAHAHAHA LOL XDDDDDD ROASTED M8");

		}
	}
}
