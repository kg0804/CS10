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
		System.out.println("Enter the change in cents");
		int change = userinput.nextInt();
		
		
		int quarters= change / 25;
		int dimes= (change % 25) / 10;
		int nickels= ((change % 25) % 10) / 5;
		
		
		
		System.out.println("Quarters:"+ quarters);
		System.out.println("Dimes:"+ dimes);
		System.out.println("Nickles:"+ nickels);
}
}


/* Screen Dump

Enter the change in cents
212
Quarters:8
Dimes:1
Nickles:0



 */
