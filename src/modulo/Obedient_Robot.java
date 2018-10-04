package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	
	static Robot turtle = new Robot();
	static void drawPolygon(int sides) {
		turtle.move(360/sides);
		turtle.turn(360/sides);
	}
   public static void main(String[] args) {
	   
   }
	  String choice = JOptionPane.showInputDialog("Do you want a polygon or a circle?");
	  if (choice.equals("circle")) {
		  turtle.move(1);
	  }else {
		  
	  }
   }