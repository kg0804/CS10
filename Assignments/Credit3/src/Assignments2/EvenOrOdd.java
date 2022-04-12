/*

Program: EvenOrOdd.java          Date: 04/12/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/

package Assignments2;

import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a interger");
		int interger = userinput.nextInt();
	
		int answer = interger % 2;
		
		if (answer == 0) {
			  System.out.println(interger + " is even");
			}
		else {
			System.out.println(interger + " is odd");
		}
}
}

/* Screen Dump

Enter a interger
50
50 is even


Enter a interger
75
75 is odd




 */