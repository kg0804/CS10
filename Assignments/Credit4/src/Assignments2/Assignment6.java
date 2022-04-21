

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
		System.out.println("What is your first name?"); // user enters name
		FirstName=input.next(); // grab name
	
		Scanner input1 = new Scanner(System.in);  // Create a Scanner object
		String LastName;
		System.out.println("What is your last name?"); //user enters name
		LastName=input.next(); // grab name
	

		Scanner input2 = new Scanner(System.in);  // Create a Scanner object
		String Grade;
		System.out.println("What grade are you in?"); //user enters age
		Grade=input.next(); // grab age
	
		Scanner input3 = new Scanner(System.in);  // Create a Scanner object
		String School;
		System.out.println("What school do you attend?"); //user enters school
		School=input.next(); // grab school name
	
		Scanner input4 = new Scanner(System.in);  // Create a Scanner object
		String Hobby;
		System.out.println("What is your favorite hobby?"); //user enters hobby
		Hobby=input.next(); //grab hobby name
	
System.out.println("Hello, your name is " + FirstName +" " + LastName +", you are currently in grade " + Grade + " at " + School + ". Your favorite hobby is " + Hobby); //print out entire sentence with strings
		
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
