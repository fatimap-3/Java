package assignment2cosc1046;

import java.util.Scanner;

public class NoOfLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = input.nextLine();
		int count = countLetters(str);
		System.out.println("The number of letters in the string is " + count);
	}
	
		 public static int countLetters(String str) {
			int count = 0;
			for(int i = 0;i < str.length(); i++) {
				if(Character.isLetter(str.charAt(i))) {
					count ++;
				}
		}
	    return count;
		 }
}
