package assignment2cosc1046;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int number = input.nextInt();
		int reversed = reverse(number);
      System.out.println("The reversed number is" + reversed);
	}
    public static int reverse(int number) {
    	int count = 0;
    	while (number != 0) {
    	int digits = number%10;
    	count = count*10 + digits;
    	number /= 10;
    	}
    	return count;
    }
    }
  
