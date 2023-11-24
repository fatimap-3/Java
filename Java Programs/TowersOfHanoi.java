package cosc2006classwork;
import java.util.Scanner;
public class TowersOfHanoi {
    
    public static void solveTowers(int count, char source, char destination, char spare) {
        if (count == 1) {
            System.out.println("Move disk from " + source + " to " + destination);
        } else {
            solveTowers(count - 1, source, spare, destination);
            System.out.println("Move disk from " + source + " to " + destination);
            solveTowers(count - 1, spare, destination, source);
        }
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the value of count ");
        int count = input.nextInt();
        solveTowers(count, 'A', 'C', 'B');
    }
}
