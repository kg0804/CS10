/*

Program: Assignment5.java          Date: 04/06/2022


Author: Karan Gill
School: CHHS
Course: Computer Science 10
 

*/


package Assignments2;
public class Assignment5 
{
	public static void main(String[] args)
	{

double math= 79+3*(4+82-68)-7+19; //calculate 
String mytext= "79+3*(4+82-68)-7+19= "; // get sentence ready for print
String newstring= mytext + math; // add strings together to print
System.out.println(newstring+"\n"); // print out equation


double math1= (179+21+10)/7+181;  //calculate 
String mytext1="(179+21+10)/7+181= " ; // get sentence ready for print
String newstring1= mytext1 + math1;  // add strings together to print
System.out.println(newstring1+"\n");  // print out equation

double math2= 10389*56*11+2246; //calculate 
String mytext2="10389*56*11+2246= " ; // get sentence ready for print
String newstring2= mytext2 + math2;   // add strings together to print
System.out.println(newstring2+"\n");  // print out equation


}
}
/* Screen Dump

79+3*(4+82-68)-7+19= 145.0

(179+21+10)/7+181= 211.0

10389*56*11+2246= 6401870.0



 */