import java.util.Scanner;
public class LastcharAndLength
{
  public static void main(String[] args)
  {
	  Scanner input= new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str = input.nextLine();
	  int len = str.length();
	  char lastch = str.charAt(len-1);
	  System.out.println("The length of the string is  "  +  len +  " and the last character of the String is " + lastch);
	   
  }
  
}

