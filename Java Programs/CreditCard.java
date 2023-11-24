package assignment6;

import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args)  {	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long num = input.nextLong();

        if (isValid(num)) {
         System.out.println("Valid credit card number");
        } 
        else  {
        	System.out.println("Invalid credit card number");
        }
    }

    public static boolean isValid(long num) {
        int sum = sumOfDoubleEvenPlace(num) + sumOfOddPlace(num);
        return sum % 10 == 0 && prefixMatched(num, 1);
    }

    public static int sumOfDoubleEvenPlace(long num) {
        int sum = 0;
        int digit;
        while (num > 0) {
            num /= 10;
            digit = (int) (2 * (num % 10));
            sum += getDigit(digit);
            num /= 10;
        }
        return sum;
    }

    public static int getDigit(int num) {
        if (num < 10) {
            return num;
        } else {
            return 1 + (num % 10);
        }
    }

    public static int sumOfOddPlace(long num) {
        int sum = 0;
        while (num > 0) {
            sum += (int) (num % 10);
            num /= 100;
        }
        return sum;
    }

    public static boolean prefixMatched(long num, int d) {
        int prefix = (int) getPrefix(num, d);
        return prefix == 4 || prefix == 5 || prefix == 6 || prefix == 37;
    }

    public static int getSize(long d) {
        int size = 0;
        while (d > 0) {
            d /= 10;
            size++;
        }
        return size;
    }

    public static long getPrefix(long num, int k) {
        int size = getSize(num);
        long prefix = num;
        for (int i = 0; i < size - k; i++) {
            prefix /= 10;
        }
        return prefix;
    }
}
