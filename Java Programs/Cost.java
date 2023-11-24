import java.util.Scanner;
public class Cost 
{

	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the distance to drive");
	  float distance = input.nextFloat();
	  System.out.println("Enter the fuel efficiency of the car in  miles per gallon");
	  float fueleff = input.nextFloat();
	  System.out.println("Enter the price per gallon");
	  float price = input.nextFloat();
	  float cost = (distance * price)/fueleff ;
	  System.out.println("The cost of driving is $"+cost);

	}

}
