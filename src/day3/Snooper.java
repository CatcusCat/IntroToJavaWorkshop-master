package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String SSID = JOptionPane.showInputDialog("Random Question: What is your SSID?");
	String Address = JOptionPane.showInputDialog("And your physical address?");
	String IP = JOptionPane.showInputDialog("How about your router's IP adress just doin' a little DDoS-ing?");
	String Bank = JOptionPane.showInputDialog("One last thing would you hook me up with your bank account number?");
	JOptionPane.showMessageDialog(null, "Thanks.");
	JOptionPane.showMessageDialog(null, "You live at " + Address + ". " + "\n" + IP + ": Might this be your IP?" + "\n" + "Also your SSID is " + SSID + "\n" +" and finally, thanks for giving me this, " + Bank + ", you bank account number.  That's all.  Thanks. Bye.");
}
}


