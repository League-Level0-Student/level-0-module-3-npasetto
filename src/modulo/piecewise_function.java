package modulo;

import javax.swing.JOptionPane;
//113383 does not work.
public class piecewise_function {
  public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Choose a number to start with.");
	int numberInt = Integer.parseInt(number);
	int steps = 0;
	while (numberInt != 1) {
		System.out.println(numberInt);
		if (numberInt%2 == 0) {
			numberInt = numberInt/2;
		}else {
			numberInt = numberInt*3+1;
		}
		steps=steps+1;
	}
	System.out.println(1);
	System.out.println(number+" was completed in "+steps+" steps.");
}
}
