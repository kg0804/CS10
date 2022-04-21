
package Assignments2;

/*

Program: PizzaCost.java          Date: 04/06/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/
import java.util.*;
public class PizzaCost 
{


	public static void main(String[] args)
	{
		   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		   double userName;
		    System.out.println("Enter pizza diameter in inches:"); //user enters number
		    userName=myObj.nextDouble(); // get number
	
    		double labor= 0.75; //price of labor
    		int rent= 1; //price of rent
    		double materials= 0.05 * userName * userName; // price of materials used depending on size of pizza
    		double totalcost= rent + materials + labor; // add up total cost
		    
    		String mytext= "The cost of the pizza is $"; // add sentence to be printed
    		String newstring= mytext + totalcost; // add sentence to be printed
    		System.out.println(newstring); //print out price
    }
}
/* Screen Dump

Enter pizza diameter in inches:
10
The cost of the pizza is $6.75


 */
