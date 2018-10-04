
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 28th";
		String dadsBirthday = "August 8th";
		String myBirthday = "May 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	      String person = JOptionPane.showInputDialog("What birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(person);
		// 4. if user asked for "mom"
		if (person.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}else if (person.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}else if (person.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, I do not remember that person's birthday.");
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
