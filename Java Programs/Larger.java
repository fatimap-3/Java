import java.util.Scanner;
public class Larger 
{

	public static void main(String[] args) 
	{   
        int num1;
	    int num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = input.nextInt();
		System.out.println("Enter the Second number");
		num2 = input.nextInt();
		int larger = (num1 > num2)? num1: num2;
		System.out.println("The Larger among the two is " + larger);
	}

}
