package cosc2006assignment1;
import java.util.Scanner; // importing the Scanner class

public class BinarySearch {

    public static boolean binarySearch(int[] array, int key, int lower, int upper) { // recursive method which returns a boolean value
        if (lower <= upper) {  // checking for the middle element
            int middle = lower + (upper - lower) / 2; // finding and initializing the middle element
            if (key < array[middle]) { // checking case 1 as per the question (If the key is less than the middle element)
                return binarySearch(array, key, lower, middle - 1); // searching for the key element in the first half of the array
            }
            else if (key == array[middle]) { // checking case 2 as per the question (If the key is equal to the middle element)
                return true; // returning true if it is 
            }
            else { 
                return binarySearch(array, key, middle + 1, upper); // case 3 as per the question (If the key is greater than the middle element)
                                                                    // searching for the key in the other half of the array 
            }
        }
        return false; // returning false if the key element is not found
    }

    public static void main(String[] args) { // main method 
        Scanner input = new Scanner(System.in); // creating object for the scanner class
        System.out.print("Enter the size of the array "); // printing the statement
        int size = input.nextInt(); // taking the input from the user
        int[] sortedArray = new int[size]; // taking a sorted array in order to find the key element
        System.out.print("Enter the elements of the array(sorted order)"); // printing the statement
        for (int i = 0; i < size; i++) { // using the loop to enter elements in the array
            sortedArray[i] = input.nextInt(); // inputing the elements
        }
        System.out.print("Enter the key to be searched "); // printing the statement
        int key2 = input.nextInt(); // getting the key element to be searched
        boolean result = binarySearch(sortedArray, key2, 0, sortedArray.length - 1); // calling the binarySearch recursive method
        if (result) { // printing the result
            System.out.println("Key has been found in the array. "); // printing this statement  is key is found
        } else {
            System.out.println("Key has not been found in the array."); // printing this statement  is key is found
        }
    }
}
