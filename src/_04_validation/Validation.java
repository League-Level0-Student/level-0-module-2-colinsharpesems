//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
	for (int i = 0; i <10; i++) {
			
		 randomNumber = randomMaker.nextInt(5);
if (randomNumber ==0 ) {
JOptionPane.showMessageDialog(null, "Ur cuul");	
}
if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "Ur awesome");	
}
if (randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "I like ur shirt.");	
}
if (randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "Nice shoes");	
}
if (randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "Ur good at coding.");	
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}}
}
