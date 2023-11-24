import java.util.Scanner;
public class QuadraticRoots 
{

	public static void main(String[] args)
	{
		
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter the value of a");
	  double a = input.nextDouble();
	  System.out.println("Enter the value of b");
	  double b = input.nextDouble();
	  System.out.println("Enter the value of c");
	  double c = input.nextDouble();
	  double discriminant = ((b*b) - 4*a*c);
	  double r1 = ((-b)+(Math.pow(discriminant,0.5)))/(2*a);
	  double r2 = ((-b)-(Math.pow(discriminant,0.5)))/(2*a);
	  
		  if(discriminant > 0)
		  {
			  System.out.println(r1);
			  System.out.println(r2);
		  }
		  else if (discriminant == 0)
			     System.out.println(r1);
		  else System.out.println("The equation has no real roots");
	  

	}

}
