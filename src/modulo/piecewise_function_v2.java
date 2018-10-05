package modulo;

import javax.swing.JOptionPane;

public class piecewise_function_v2 {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("How many numbers do you want to test?");
		int numberInt = Integer.parseInt(number);
		int maxSteps = 0;
		int recordNumber = 0;
		for (int i = 113384; i<numberInt+1; i++) {
		int steps = 0;
		int calculator = i;
		while (calculator != 1) {
			//System.out.println(calculator);
			if (calculator%2 == 0) {
				calculator = calculator/2;
			}else {
				calculator = calculator*3+1;
			}
			steps=steps+1;
		}
		//System.out.println(1);
		System.out.println(i+" was completed in "+steps+" steps.");
		if (steps>maxSteps) {
			maxSteps = steps;
			recordNumber = i;
		}
		}
		JOptionPane.showMessageDialog(null, "The record number was "+recordNumber+". The largest amount of steps was "+maxSteps+".");
	}
}
