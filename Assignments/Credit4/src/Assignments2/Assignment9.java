/*

Program: Assignment9.java          Date: 04/11/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

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

/* Screen Dump

14 / 4 = 3
14 % 4 = 2

4 / 14 = 0
4 % 14 = 4


 */
