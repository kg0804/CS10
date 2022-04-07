

package Assignments2;

/*

Program: Assignment6.java          Date: 04/07/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/
import java.util.*;
public class Assignment6 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);  // Create a Scanner object
		String FirstName;
		System.out.println("What is your first name?");
		FirstName=input.next();
	
		Scanner input1 = new Scanner(System.in);  // Create a Scanner object
		String LastName;
		System.out.println("What is your last name?");
		LastName=input.next();
	

		Scanner input2 = new Scanner(System.in);  // Create a Scanner object
		String Grade;
		System.out.println("What grade are you in?");
		Grade=input.next();
	
		Scanner input3 = new Scanner(System.in);  // Create a Scanner object
		String School;
		System.out.println("What school do you attend?");
		School=input.next();
	
		Scanner input4 = new Scanner(System.in);  // Create a Scanner object
		String Hobby;
		System.out.println("What is your favorite hobby?");
		Hobby=input.next();
	
System.out.println("Hello, your name is " + FirstName +" " + LastName +", you are currently in grade " + Grade + " at " + School + ". Your favorite hobby is " + Hobby);
		
}
}

/* Screen Dump

What is your first name?
Karan
What is your last name?
Gill
What grade are you in?
12
What school do you attend?
CHHS
What is your favorite hobby?
Soccer
Hello, your name is Karan Gill, you are currently in grade 12 at CHHS. Your favorite hobby is Soccer


 */
