package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Mandlebrot");
		// 2. Catch the user's answer in a String
		String mand = JOptionPane.showInputDialog("Spell it.");
		// 3. If the user spelled the word correctly, speak "correct"
		if (mand.equalsIgnoreCase("mandelbrot")) {
			JOptionPane.showMessageDialog(null, "Correct");
			
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "Wrong, it's mandlebrot");
		}
		// 5. repeat the process for other words
		speak("Extradite");
		// 2. Catch the user's answer in a String
		String ext = JOptionPane.showInputDialog("Spell it.");
		// 3. If the user spelled the word correctly, speak "correct"
		if (ext.equalsIgnoreCase("extradite")) {
			JOptionPane.showMessageDialog(null, "Correct");
			
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "Wrong, it's extradite");
		}
		speak("Raspberry");
		// 2. Catch the user's answer in a String
		String hel = JOptionPane.showInputDialog("Spell it.");
		// 3. If the user spelled the word correctly, speak "correct"
		if (hel.equalsIgnoreCase("Raspberry")) {
			JOptionPane.showMessageDialog(null, "Correct");
			
		}
		// 4. Otherwise say "wrong"
		else {
			JOptionPane.showMessageDialog(null, "Wrong, it's Raspberry");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


