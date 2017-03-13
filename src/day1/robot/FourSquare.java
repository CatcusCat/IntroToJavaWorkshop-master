package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot sparky = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		sparky.setSpeed(10);
		// 5. Set the pen width to 5
		sparky.setPenWidth(6);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {

			// 7. Set the pen color to random
			sparky.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			sparky.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		sparky.penDown();
		sparky.move(100);
		sparky.turn(90);
		sparky.move(100);
		sparky.turn(90);
		sparky.move(100);
		sparky.turn(90);
		sparky.move(100);
		sparky.turn(90);

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}