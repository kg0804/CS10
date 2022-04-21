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
		
		System.out.println("First Digit: " + firstdigit + " Second Digit: " + seconddigit + " Third Digit: " + thirddigit);
		
		int max, min =0;
		

if(firstdigit < seconddigit && seconddigit < thirddigit)
{
	max = thirddigit;
	min = firstdigit;
	
	System.out.println(" Largest Number: "+ max + "Smallest Number :" + min);

}
else if(firstdigit > seconddigit && seconddigit > thirddigit); 
{
	max = firstdigit;
	min = thirddigit;

	System.out.println(" Largest Number: "+ max + "Smallest Number :" + min);
}
if (firstdigit < seconddigit && seconddigit > thirddigit);
{
	max= seconddigit;
	min = firstdigit;
	
	System.out.println(" Largest Number: "+ max + "Smallest Number :" + min);
	
	
}

}
	
}

