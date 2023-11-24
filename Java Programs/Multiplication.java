package assignment1cosc1046;

import java.util.Scanner;
public class Multiplication 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer between 0 and 1000");
		int integer= input.nextInt();
		int a = integer%10; // extracting the last digit
		int b = integer/10; // extracting the next two digits 
		int c = b%10; // extracting the second last digit
		int d = b/10; // extracting the first digit
		int multiplication = a*c*d;
		System.out.println(" The Multiplication of each di"
				+ "git of the integer is  "
				 + multiplication);
				

	}

}
