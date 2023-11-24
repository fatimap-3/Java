package assignment7;

import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num[]= new int[10];
		int even=0;
		int odd = 0;
        System.out.println("Enter numbers one by one (enter 0 to stop):");
       for(int i=0;i<10;i++)
       {
    	 
        	num[i] = input.nextInt();
        	  {
              	if(num[i]==0)
              		System.exit(0);
              }
       }
	   for(int i = 0; i<10;i++) {
		   if(num[i]%2 == 0) 
			   even++ ;
		   else 
			   odd++;
	   }
	 System.out.println("The number of even numbers are " + even);
	 System.out.println("The number of odd numbers are " + odd);
	}
	}


