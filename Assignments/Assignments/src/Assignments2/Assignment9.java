package Assignments2;

import java.util.Scanner;

public class Assignment9 
{
	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a interger");
		int firstint = userinput.nextInt();
		
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a second interger");
		int secondint = userinput.nextInt();
		
		System.out.println(firstint + " / " + secondint + " = " + firstint / secondint);
		System.out.println(firstint + " % " + secondint + " = " + firstint % secondint + "\n");
	

		System.out.println(secondint + " / " + firstint + " = " + secondint / firstint);
		System.out.println(secondint + " % " + firstint + " = " + secondint % firstint + "\n");
	
}
}

