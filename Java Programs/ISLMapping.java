import java.util.Scanner;
public class ISLMapping
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter");
		String s = input.nextLine();
			if(s.length() != 1  || !Character.isLetter(s.charAt(0)))
			{ 
				System.out.println("Your input is Invalid");
			return;
		}
		char letter = Character.toUpperCase(s.charAt(0));
        int num;
        
        switch(letter)
        {
        case 'A':
        case 'B':
        case 'C':
        	    num = 2;
        break;
        case 'D':
        case 'E':
        case 'F':
                num = 3;
         break;
         case 'G':
         case 'H':
         case 'I':
                num = 4;
         break;
         case 'J':
         case 'K':
         case 'L':
                num = 5;
         break;
         case 'M':
         case 'N':
         case 'O':
                num = 6;
         break;
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
                num = 7;
         break;
         case 'T':
         case 'U':
         case 'V':
                num = 8;
         break;
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
                num = 9;
         break;
         default:
                System.out.println("Invalid input.");
         return;
        }

        System.out.println("The number corresponding to " + letter + " is " + num + ".");
    }
}
