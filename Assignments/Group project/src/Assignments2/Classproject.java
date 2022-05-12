package Assignments2;

import java.util.Scanner;

public class Classproject
{


	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a number between 1-4"); //user enters number
		int operator = userinput.nextInt(); //grab and store number

		int Firstnumber = (int) (1 +  (Math.random() * 10)); // find first random number
		double secondnumber = (int) (1 + (Math.random() * 10)); // find second random number
		
		switch (sign)
		{
		case 1: 
		{
			int answer = firstnumber + secondnumber; // find answer to equation
			System.out.println(firstnumber + " + " + secondnumber); //display question
			Scanner userinput = new Scanner(System.in);  // Create a Scanner object
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
			Scanner userinput = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter answer"); //user enters number
			int useranswer2 = userinput.nextInt(); //grab and store number
			
			if ( answer1 == useranswer2) // check answer
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
			Scanner userinput = new Scanner(System.in);  // Create a Scanner object
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
		    int answer4 = firstnumber /  secondnumber; // find answer to equation
			System.out.println(firstnumber + " / " + secondnumber); //display question
			Scanner input4 = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter answer"); //user enters number
			int useranswer4 = userinput.nextInt(); //grab and store number
			 
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
	

		