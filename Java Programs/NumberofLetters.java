package practise;

import java.util.Scanner;
public class NumberofLetters 
{
public static void main (String[] args)
{
Scanner input = new Scanner (System.in);
System. out.println("Enter a string: ");
String string = input.nextLine();
int len = letters(string);
System. out.println ("Total letters in string: " + len + "Letters" );
}


      public static int letters(String string) {
     int count=0;
     {
    	 
    for (int i= 0; i <= string.length(); i++)
    {
	 if (Character.isLetter(string.charAt (i)));
}
      count++; 
  return count;   
}