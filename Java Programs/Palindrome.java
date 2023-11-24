package cosc2006assignment1;
import java.util.Scanner; // importing the scanner class

public class Palindrome {
    public static void main(String[] args) {  // main method
        Scanner input = new Scanner(System.in); // creating object for the scanner class
        System.out.print("Enter a string ");
        String s = input.nextLine(); // taking input from the user

        if (isPalindrome(s)) {  // checking is string is palindrome or not 
            System.out.println("The String is a Palindrome"); // printing statement
        } else {
            System.out.println("The String is not a Palindrome"); // printing statement
        }
    }

    public static boolean isPalindrome(String s) { // this method is checking if string is palindrome or not
        if (s.length() <= 1) { 
            return true; // returning true if length of string is greater than or equal to one. this also acts as our base case
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) { // checking if first and last characters are same or not
                return isPalindrome(s.substring(1, s.length() - 1)); // checking the string recursively
            } else {
                return false; // returning false if the string is not palindrome
            }
        }
    }
}

