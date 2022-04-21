/*

Program: Assignment8ThreeDigits.java          Date: 04/11/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class Assignment8ThreeDigit 
{

	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a three digit number"); //user enters number
		int threedigits = userinput.nextInt(); // grab and store number
		
		int firstdigit = threedigits / 100; //isolate first digit
		int seconddigit = (threedigits / 10) % 10; //isolate second digit
		int thriddigit = (threedigits % 10); //isolate third digit
		
		
	
		System.out.println("The hundreds-place digit is " + firstdigit); //print out first digit
		System.out.println("The tens-place digit is " + seconddigit); //print out second digit
		System.out.println("The ones-place digit is " + thriddigit); //print out third digit
}
}

/* Screen Dump

Enter a three digit number
385
The hundreds-place digit is 3
The tens-place digit is 8
The ones-place digit is 5



 */