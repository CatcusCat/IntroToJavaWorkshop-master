package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot sparky = new Robot();
		sparky.penDown();
		for (int i = 0; i < 4; i++) {
			sparky.move(100);
			sparky.turn(90);
		}

		sparky.penUp();

	}
}
