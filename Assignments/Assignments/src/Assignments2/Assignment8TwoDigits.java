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
		System.out.println("Enter a two digit number");
		
		int twodigits = userinput.nextInt();
		
		int firstdigit = twodigits / 10;
		int seconddigit = twodigits % 10;
		
		System.out.println("The tens-place digit is " + firstdigit);
		System.out.println("The ones-place digit is " + seconddigit);
		
}
}


/* Screen Dump

Enter a two digit number
57
The first digit of the number is 5
The second digit of the number is 7


 */
