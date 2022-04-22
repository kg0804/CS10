/*

Program: Assignment11.java          Date: 04/12/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/
package Assignments2;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a any three digits"); //user enters number
		int threedigits = userinput.nextInt(); //grab and store number
	
		int firstdigit = threedigits / 100; //isolate first digit
		int seconddigit = (threedigits / 10) % 10; //isolate second digit
		int thirddigit = (threedigits % 10); //isolate third digit
		
		System.out.println("First Digit: " + firstdigit + " Second Digit: " + seconddigit + " Third Digit: " + thirddigit + "\n");
		
		int max, min =0;
		

if(firstdigit < seconddigit && seconddigit < thirddigit)
{
	max = thirddigit;
	min = firstdigit;
	
	System.out.println("Largest Number: "+ max + " Smallest Number : " + min);

}
else if(firstdigit > seconddigit && seconddigit > thirddigit)
{
	max = firstdigit;
	min = thirddigit;

	System.out.println("Largest Number: "+ max + " Smallest Number : " + min + "\n");
}
else if (firstdigit < seconddigit && seconddigit > thirddigit)
{
	max= seconddigit;
	min = firstdigit;
	
	System.out.println("Largest Number: "+ max + " Smallest Number : " + min + "\n");

}

else if (firstdigit < seconddigit && seconddigit > thirddigit && firstdigit > thirddigit)
{
	max= seconddigit;
	min = thirddigit;
	
	System.out.println("Largest Number: "+ max + " Smallest Number : " + min + "\n");

}

else if (firstdigit > seconddigit && seconddigit < thirddigit)
{
	max= thirddigit;
	min = seconddigit;
	
System.out.println("Largest Number: "+ max + " Smallest Number : " + min + "\n");

}

else System.out.println("Wrong Input, try agian"); 
{
}

int add = firstdigit + seconddigit + thirddigit;
System.out.println("The sum of the three digit is " + add);

int prdc = firstdigit * seconddigit * thirddigit; 
System.out.println("The product of the three digits is " + prdc);

int average = (firstdigit + seconddigit + thirddigit) / 3;
System.out.println("The average of the three digits is " + average);


}





}
	

/* Screen Dump

Enter a any three digits
621
First Digit: 6 Second Digit: 2 Third Digit: 1

Largest Number: 6 Smallest Number : 1

The sum of the three digit is 9
The product of the three digits is 12
The average of the three digits is 3



 */


