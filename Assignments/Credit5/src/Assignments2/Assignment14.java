/*

Program: Assignment14.java          Date: 04/26/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class Assignment14 
{
	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("How old are you?"); //user enters number
		int age = userinput.nextInt(); //grab and store number
		
		if ( age > 18)
		{
			System.out.println("You are an adult");
		}
		
		else if ( age <= 5 )
		{
			System.out.println("You are a toddler");
		}
		
		else if ( age < 10 && age > 5)
		{
			System.out.println("You are a child");
		}
		
		else if (age < 12 && age > 10)
		{
			System.out.println("You are a preteen");
		}
		
		else if ( age > 12 && age <= 18)
		{
			System.out.println("You are a teen");
		}
		
		else System.out.println("Wrong input");
}
}

/* Screen Dump

How old are you?
5
You are a toddler


 */

