
/*

Program: Assignment13.java          Date: 04/26/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class Assignment13 
{


public static void main(String[] args)
{
	Scanner userinput = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Enter number of copies"); //user enters number
	int copies = userinput.nextInt(); //grab and store number
	
	
	if (copies < 100) // check number of copies
	{
		double price = 0.30; //save price depending on copy number
		
		System.out.println("Price of each copy is $0.30");
		System.out.println("Total cost of job: $" + price * copies); //print based on information given
	}
	
	else if (100 < copies && copies < 499) // check number of copies
	{
		double price = 0.28; //save price depending on copy number
		
		System.out.println("Price of each copy is $0.28");
		System.out.println("Total cost of job: $" + price * copies); //print based on information given
	}
	
	else if (500 < copies && copies < 749) // check number of copies
	{
		double price = 0.27; //save price depending on copy number
		
		System.out.println("Price of each copy is $0.27");
		System.out.println("Total cost of job: $" + price * copies); //print based on information given
	}
	

	else if (750 < copies && copies < 1000) // check number of copies
	{
		double price = 0.26; //save price depending on copy number
		
		System.out.println("Price of each copy is $0.26");
		System.out.println("Total cost of job is: $" + price * copies); //print based on information given
		
	}
	
	else if (1000 < copies) // check number of copies
	{
		double price = 0.25; //save price depending on copy number
		
		System.out.println("Price of each copy is $0.25");
		System.out.println("Total cost of job is: $" + price * copies); //print based on information given
	}
	
	else System.out.println("Wrong input"); 
	{
	}
	
	
}
}

/* Screen Dump

Enter number of copies
1001
Price of each copy is $0.25
Total cost of job is: $250.25


 */
	