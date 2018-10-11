package modulo;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	
	static Robot turtle = new Robot();
	static void drawPolygon(int sides) {
		for (int i = 0; i < sides; i++) {
			
		turtle.move(1080/sides);
		turtle.turn(360/sides);
		}
	}
   public static void main(String[] args) {
	   turtle.penDown();
   turtle.setSpeed(100);
   turtle.miniaturize();
   Random rand = new Random();
	  String choice = JOptionPane.showInputDialog("Do you want a polygon or a circle?");
	  String color = JOptionPane.showInputDialog("What pen color do you want?It can be red, green, or blue.");
	  if (color.equalsIgnoreCase("red")) {
		  turtle.setPenColor(255, 0, 0);
	  }else if (color.equalsIgnoreCase("green")) {
		  turtle.setPenColor(0, 255, 0);
	  }else if (color.equalsIgnoreCase("blue")) {
		  turtle.setPenColor(0, 0, 255);
	  }else {
		  JOptionPane.showMessageDialog(null, "I do not know that color.");
		  turtle.setPenColor(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
	  }
	  if (choice.equals("circle")) {
		  for (int i = 0; i < 36; i++) {
			
		  turtle.move(30);
		  turtle.turn(10);
		  }
	  }else {
		  String sides = JOptionPane.showInputDialog("How many sides do you want?");
		  int sidesInt = Integer.parseInt(sides);
		  drawPolygon(sidesInt);
	  }
   }
}