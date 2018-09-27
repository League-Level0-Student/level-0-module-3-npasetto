//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot turtle = new Robot();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			
		
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
        if (color.equalsIgnoreCase("red")) {
        	turtle.setPenColor(255, 0, 0);
        }else if (color.equalsIgnoreCase("green")) {
        	turtle.setPenColor(0, 255, 0);
        }else if (color.equalsIgnoreCase("blue")) {
        	turtle.setPenColor(0, 0, 255);
        }else {
        	turtle.setPenColor(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        }
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		turtle.setPenWidth(10);
		turtle.setSpeed(100);
		turtle.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
        int sides = rand.nextInt(20)+3;
        for (int j = 0; j < sides; j++) {
			turtle.move(700/sides);
			turtle.turn(360/sides);
		}
		}
	}
}
