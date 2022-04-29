package Assignments2;

import java.util.Scanner;

public class Assignment17 
{
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter your GPA or -1 to quit the application"); //user enters number
		int gpa = userinput.nextInt(); //grab and store number
		
		if (gpa == -1)
		{
			//quit program
		}
		
		else if (gpa >= 3.8)
		{
			System.out.println("summa cum laude");
		}
		
		else if ( gpa < 3.8)
		{
		
		Scanner userinput1 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("If you wish enter another GPA, enter it. If not -1 to quit the application"); //user enters number
		int gpa1 = userinput.nextInt(); //grab and store number

		if ( gpa1 == -1)
		{
			//quit
		}
		
		else if ( gpa1 < 3.8 && gpa > 3.65)
		{
			System.out.println("manga cum laude");
		}
		
		
		else if ( gpa1 < 3.65)
		{
			Scanner userinput2 = new Scanner(System.in);  // Create a Scanner object
			System.out.println("If you wish enter another GPA, enter it. If not -1 to quit the application"); //user enters number
			int gpa2 = userinput.nextInt(); //grab and store number
			
			
		}
		}
		
} 
}
