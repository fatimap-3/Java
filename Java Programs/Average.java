package practise;

import java.io.IOException;
import java.util.Scanner;
public class Average {
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int a,b,c =0;
		System.out.println("Please enter a" + a);
		a = sc.nextInt();
	    b = sc.nextInt();
		c = sc.nextInt();
		int calculateAverage=0;
		calculateAverage= printAverage(a,b,c);
		System.out.println(calculateAverage);

	}
	
	public static int printAverage(int a, int b, int c) {
		int average = (a+b+c)/3;
		return average;
	}


}
