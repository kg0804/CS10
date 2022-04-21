/*

Program: EvenOrOdd.java          Date: 04/12/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a interger"); //user enters number
		int interger = userinput.nextInt(); //grab and store number
	
		int answer = interger % 2; // calculate if number equals zero
		
		if (answer == 0) {
			  System.out.println(interger + " is even"); //print "its even" if number equals zero
			}
		else {
			System.out.println(interger + " is odd"); //print "its odd" if number does not equal zero
		}
}
}

/* Screen Dump

Enter a interger
50
50 is even


Enter a interger
75
75 is odd




 */