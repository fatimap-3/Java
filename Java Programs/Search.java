package assignment7;

import java.util.Arrays;

public class Search{
    public static void main(String[] args) {
        int[] numbers = new int[100000000];
        for (int i = 0; i < numbers.length; i++) {
        	numbers[i] = i + 1;
        }
        int searchIndex;
        long startTime = System.nanoTime();
        linear(numbers, 1);
        linear(numbers, 25000000);
        linear(numbers, 50000000);
        linear(numbers, 75000000);
        linear(numbers, 100000000);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;
        System.out.println("Linear Search Time: " + linearSearchTime);

       
        startTime = System.nanoTime();
        binary(numbers, 1);
        binary(numbers, 25000000);
        binary(numbers, 50000000);
        binary(numbers, 75000000);
        binary(numbers, 100000000);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;
        System.out.println("Binary Search Time: " + binarySearchTime);

    }

    public static int linear(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                return i;
            }
        }
        return -1;
    }
    public static int binary(int[] numbers, int search) {
     int low=0;
     int high = numbers.length-1;
     while(high>=low) {
    	 int mid=(low+high)/2;
    	 if(search<numbers[mid])high=mid-1;
    	 else if (search == numbers[mid])return mid;
    	 else low = mid+1;
     }
     return -1;
     }
}
