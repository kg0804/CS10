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
		System.out.println("Enter a three digit number");
		int threedigits = userinput.nextInt();
		
		int firstdigit = threedigits / 100;
		int seconddigit = (threedigits / 10) % 10;
		int thriddigit = (threedigits % 10); 
		
		
	
		System.out.println("The hundreds-place digit is " + firstdigit);
		System.out.println("The tens-place digit is " + seconddigit);
		System.out.println("The ones-place digit is " + thriddigit);
}
}

/* Screen Dump

Enter a three digit number
385
The first digit of the number is 3
The second digit of the number is 8
The third digit of the number is 5


 */