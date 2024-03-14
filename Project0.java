/*
 Name: Li Hang Biao
 Lab Section: 11A
 */

import javax.swing.*; 
public class Project0 {
	public static void main(String[] args){
		int stopCounter = 0;
		String stop = "stop";
		while (stopCounter < 1) { //Conditional loop, also a infinite loop if stopCounter stop at 0 forever
		String input;
		int eCounter = 0;
		int Ecounter = 0;
		input = JOptionPane.showInputDialog(null, "Enter a sentence: ");
				int size = input.length();
				
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) == 'e') eCounter = eCounter + 1;
		    if (input.charAt(i) == 'E') Ecounter =  Ecounter + 1;
		}
		if (input.equalsIgnoreCase(stop)) System.exit(0); //If user type "stop" at either upper case or lower case, the system will detect it to be true.

		JOptionPane.showMessageDialog(null, "Number of lower case e's: "+ eCounter + "\n"
				 + "Number of upper case e's: " + Ecounter);
		}
		
		System.exit(0);

	}
}