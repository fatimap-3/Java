package assignment1cosc1046;

import java.util.Scanner;
public class Letter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter");
		String s = input.nextLine();
		char letter = s.charAt(0);
			{
			if(letter >= 'a' && letter <='z')
			{
				System.out.println("Valid Input");
			
				if(letter == 'a' || letter == 'e' || letter == 'i' ||
						letter == 'o' || letter == 'u')
					System.out.println("The entered letter is a vowel");
				else 
				   System.out.println("The entered letter is a consonent");
			}
			else System.out.println("Invalid Output");
		}
	}
}


