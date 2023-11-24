package assignment2cosc1046;

import java.util.Scanner;
public class Largest 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
        
        double largest = max(numbers);
        System.out.println("The largeest value is: " + largest);
    }
    
    public static double max(double[] array) 
    {
        double temp = array[0];
        for (int j = 1; j < array.length; j++)
        {
            if (array[j] > temp) {
                temp = array[j];
            }
        }
        return temp;
    }
}