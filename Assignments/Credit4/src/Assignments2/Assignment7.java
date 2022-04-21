/*

Program: Assignment7.java          Date: 04/11/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/


package Assignments2;

import java.util.Scanner;

public class Assignment7 
{

	public static void main(String[] args)
	{
	
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter the change in cents"); // user enters change 
		int change = userinput.nextInt(); //grab number and store
		
		
		int quarters= change / 25; // amount of quarters
		int dimes= (change % 25) / 10; //amount of dimes
		int nickels= ((change % 25) % 10) / 5; //amount of nickels
		
		
		
		System.out.println("Quarters:"+ quarters); //print out number of quarters
		System.out.println("Dimes:"+ dimes); //print out number of dimes
		System.out.println("Nickles:"+ nickels); //print out number of nickels
}
}


/* Screen Dump

Enter the change in cents
212
Quarters:8
Dimes:1
Nickles:0



 */
