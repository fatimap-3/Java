import java.util.Scanner;
public class ASCII {

	public static void main(String[] args)
	{
	  char c;
	  int ascii;
	  Scanner input= new Scanner(System.in);
	  System.out.println("Enter the character");
	  c = input.next().charAt(0);
	  ascii = (int)c;
	  System.out.println(" The ASCII code for the Character " + c + " is " + ascii);
	  
	  

	}

}