package Assignments2;

import java.util.Scanner;

public class Assignment16 {


public static void main(String[] args)
{
	Scanner userinput = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter a number between 1-20"); //user enters number
	int usernumber = userinput.nextInt(); //grab and store number
	
	int computernumber = (int) (1 +  (Math.random() * 20)); // find first random number
	
	System.out.println("Your number: " + usernumber + "\n");
	System.out.println("Computer Number: " + computernumber + "\n");
	
	if (usernumber == computernumber)
	{
		System.out.println("You win!");
	}
	else System.out.println("You lose, try agian");
}
}