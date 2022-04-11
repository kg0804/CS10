package Assignments2;

import java.util.Scanner;

public class Assignment8 
{

	
	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a two digit number");
		
		int twodigits = userinput.nextInt();
		
		int firstdigit = twodigits / 10;
		int seconddigit = twodigits % 10;
		
		System.out.println("The first digit of the number is " + firstdigit);
		System.out.println("The second digit of the number is " + seconddigit);
		
}
}

