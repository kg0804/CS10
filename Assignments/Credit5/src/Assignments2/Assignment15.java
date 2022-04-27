/*

Program: Assignment15.java          Date: 04/27/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 //

*/

package Assignments2;

import java.util.Random;
import java.util.Scanner;

public class Assignment15 
{

public static void main(String[] args)
{
	Scanner userinput = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter a number between 1-4"); //user enters number
	int operator = userinput.nextInt(); //grab and store number

	int firstnumber = (int) (1 +  (Math.random() * 10)); // find first random number
	int secondnumber = (int) (1 + (Math.random() * 10)); // find second random number
	
	switch (operator)
	{
	case 1: 
	{
		int answer = firstnumber + secondnumber; // find answer to equation
		System.out.println(firstnumber + " + " + secondnumber); //display question
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter answer"); //user enters number
		int useranswer = userinput.nextInt(); //grab and store number
		
		if ( answer == useranswer) // check answer
		{
			System.out.println("Correct!");
		}
		else System.out.println("Wrong, try again");
		 break; // end case
	}
	case 2:
	{
		int answer2 = firstnumber - secondnumber; // find answer to equation
		System.out.println(firstnumber + " - " + secondnumber); //display question
		Scanner input2 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter answer"); //user enters number
		int useranswer2 = userinput.nextInt(); //grab and store number
		
		if ( answer2 == useranswer2) // check answer
		{
			System.out.println("Correct!");
		}
		else System.out.println("Wrong, try again");
		 break; // end case
	}
	case 3:
	{
		int answer3 = firstnumber * secondnumber; // find answer to equation
		System.out.println(firstnumber + " * " + secondnumber); //display question
		Scanner input3 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter answer"); //user enters number
		int useranswer3 = userinput.nextInt(); //grab and store number
		
		if ( answer3 == useranswer3) // check answer
		{
			System.out.println("Correct!");
		}
		else System.out.println("Wrong, try again");
		 break; // end case
	}
	case 4:
	{
		double answer4 = (double) firstnumber / (double) secondnumber; // find answer to equation
		System.out.println(firstnumber + " / " + secondnumber); //display question
		Scanner input4 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter answer"); //user enters number
		double useranswer4 = userinput.nextDouble(); //grab and store number
		 
		if ( answer4 == useranswer4) // check answer
		{
			System.out.println("Correct! Well done!");
		}
		else System.out.println("Wrong, try again");
		 break; // end case
	}
		
	}


    
}
}

/* Screen Dump

Enter a number between 1-4
3
1 * 9
Enter answer
9
Correct!

 */
