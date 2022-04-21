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
		
		int max, min =0;
		

if(firstdigit < seconddigit && seconddigit < thirddigit)
{
	max = thirddigit;
	min = firstdigit;

}
else if(firstdigit > seconddigit && seconddigit > thirddigit); 
{
	max = firstdigit;
	min = thirddigit;

}
if (firstdigit < seconddigit && seconddigit > thirddigit);
{
	max= seconddigit;
	min = firstdigit;
	
	
}

}
	
}

