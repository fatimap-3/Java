import java.util.Scanner;
public class Score
{
	public static void main(String[] args)
	{
		int i;
		String name;
		double score;
		double lowest = 1000;
		double secondlowest =1000;
		String lowestname = null;
		String secondlowestname= null;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numofstd = input.nextInt();

		for (i = 0; i < numofstd; i++) {
            System.out.print("\nStudent name: ");
            name = input.next();
            System.out.print("Score: ");
            score = input.nextDouble();
            if (score < lowest) {
                secondlowest = lowest;
                secondlowestname = lowestname;
                lowest = score;
                lowestname = name;
            } else if (score < secondlowest) {
                secondlowest = score;
                secondlowestname = name;
            }
        }

		System.out.println("The name of student with lowest marks is " + lowestname);
		System.out.println("The name of student with second lowest marks is " + secondlowestname);
		}			
}
