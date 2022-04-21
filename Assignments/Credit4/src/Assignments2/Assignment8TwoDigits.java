/*

Program: Assignment8TwoDigits.java          Date: 04/11/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class Assignment8TwoDigits 
{

	
	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a two digit number"); //user enters number
		
		int twodigits = userinput.nextInt(); // grab and store number
		
		int firstdigit = twodigits / 10; //isolate first digit
		int seconddigit = twodigits % 10; //isolate second digit
		
		System.out.println("The tens-place digit is " + firstdigit); //print first digit
		System.out.println("The ones-place digit is " + seconddigit); //print second digit
		
}
}


/* Screen Dump

Enter a two digit number
57
The tens-place digit is 5
The ones-place digit is 7


 */
