
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
		    System.out.println("Enter pizza diameter in inches:");
		    userName=myObj.nextDouble();
	
    		double labor= 0.75;
    		int rent= 1;
    		double materials= 0.05 * userName * userName;
    		double totalcost= rent + materials + labor;
		    
    		String mytext= "The cost of the pizza is $";
    		String newstring= mytext + totalcost;
    		System.out.println(newstring);
    }
}
/* Screen Dump

Enter pizza diameter in inches:
10
The cost of the pizza is $6.75


 */
