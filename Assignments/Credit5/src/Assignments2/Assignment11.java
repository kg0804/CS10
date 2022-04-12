package Assignments2;

import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a any three digits");
		int threedigits = userinput.nextInt();
	
		int firstdigit = threedigits / 100;
		int seconddigit = (threedigits / 10) % 10;
		int thirddigit = (threedigits % 10); 
		

	 if (firstdigit < seconddigit ) {
		 
		} else {
		  System.out.println("Good evening.");
		}
}
}


