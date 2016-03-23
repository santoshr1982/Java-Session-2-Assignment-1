package a.ge;

import java.util.Scanner;

public class Age {
	

	public static void main(String[] args) {
		
		int iAge;									//Declaration of variable to hold the users age.
		
		Scanner sA = new Scanner(System.in);		// Declaration to accept input.
		
		
		System.out.println("Please enter your age:"); // Display message.
		iAge=sA.nextInt();								// Accept age.

		if(iAge<=0)										// Condition to check if the input is negative.
		{
			iAge=(-1 * iAge);								// Convert negative values into positive values.
		}
		
		if(iAge >= 18)									// Condition to check whether the value is greater or equal to 18. 
		{
			System.out.println("You are eligible to vote and your age is " + iAge + "."); //Prints eligible.
		}
		
		else
		{
			System.out.println("You are not eligible to vote and your age is " + iAge + "."); // Print not eligible.
		}
		
	}
	
}
