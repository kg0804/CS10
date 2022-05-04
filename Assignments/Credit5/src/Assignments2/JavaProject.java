/*

Program: JavaProject.java          Date: 05/04/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class JavaProject
{
	public static void main(String[] args)
	{	Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a postion from 1-5 in the Toronto Raptors starting line up"); //user enters number
		int player = userinput.nextInt(); //grab and store number
		
		double fred = 20.3;
		double gary = 18.3;
		double og = 17.1;
		double scottie = 15.3;
		double pascal = 22.8;

		switch (player)
		{
		case 1: 
		{
		
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter the exact number of points Fred Vanvleet averaged in the 2021-2022 season /n"); //user enters number
			double useranswer = userinput.nextDouble(); //grab and store number
			
			if ( fred == useranswer) // check answer
			{
				System.out.println("Correct! This season Fred Vanvleet averaged 20.3 points per game. \n");
			}
			else System.out.println("Wrong. Fred Vanvleet averaged 20.3 point per game \n");
			 break; // end case
		
		}	
		
		case 2: 
		{
		
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter the exact number of points Gary Trent Jr averaged in the 2021-2022 season \n"); //user enters number
			double useranswer = userinput.nextDouble(); //grab and store number
			
			if ( gary == useranswer) // check answer
			{
				System.out.println("Correct! This season Gary Trent Jr averaged 18.3 points per game. \n");
			}
			else System.out.println("Wrong. Gary Trent Jr averaged 18.3 point per game \n");
			 break; // end case
		
		}	
		
		case 3: 
		{
		
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter the exact number of points OG Anunoby averaged in the 2021-2022 season \n"); //user enters number
			double useranswer = userinput.nextDouble(); //grab and store number
			
			if ( og == useranswer) // check answer
			{
				System.out.println("Correct! This season OG Anunoby averaged 17.1 points per game. \n");
			}
			else System.out.println("Wrong. OG Anunoby averaged 17.1 point per game \n");
			 break; // end case
		
		}
		
		case 4: 
		{
		
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter the exact number of points Scottie Barnes averaged in the 2021-2022 season \n"); //user enters number
			double useranswer = userinput.nextDouble(); //grab and store number
			
			if ( scottie == useranswer) // check answer
			{
				System.out.println("Correct! This season Scottie Barnes averaged 15.3 points per game. \n");
			}
			else System.out.println("Wrong. Scottie Barnes averaged 15.3 point per game \n");
			 break; // end case
		}
		
		case 5: 
		{
		
			Scanner input = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter the exact number of points Pascal Siakam averaged in the 2021-2022 season \n"); //user enters number
			double useranswer = userinput.nextDouble(); //grab and store number
			
			if ( pascal == useranswer) // check answer
			{
				System.out.println("Correct! This season Pascal Siakam averaged 22.8 points per game. \n");
			}
			else System.out.println("Wrong. Pascal Siakam averaged 22.8 point per game \n");
			 break; // end case
		}
		
		}
		
		Scanner userinput1 = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Do you want tickets! Enter the amount of tickets you want."); //user enters number
		int tickets = userinput.nextInt(); //grab and store number
		
		if (tickets == 1) // check number of tickets
		{
			double price = 200; //save price depending on amount of tickets 
			
			System.out.println("Price of ticket is $200");
			System.out.println("Total cost: $" + price * tickets); //print based on information given
		}
		
		else if (tickets > 1 && tickets < 5) // check number of tickets
		{
			double price = 175; //save price depending on amount of tickets
			
			System.out.println("Price of each ticket is $175");
			System.out.println("Total: $" + price * tickets); //print based on information given
		}
		

		else if (tickets >= 5) // check number of tickets
		{
			double price = 150; //save price depending on amount of tickets
			
			System.out.println("Price of each ticket is $150");
			System.out.println("Total: $" + price * tickets); //print based on information given
		}
		
		else System.out.println("Thanks for using the program!"); 
		{
		}
	
		
		
}
}

/* Screen Dump

Enter a postion from 1-5 in the Toronto Raptors starting line up
5
Enter the exact number of points Pascal Siakam averaged in the 2021-2022 season 

22.8
Correct! This season Pascal Siakam averaged 22.8 points per game. 

Do you want tickets! Enter the amount of tickets you want.
2
Price of each ticket is $175
Total: $350.0


 */