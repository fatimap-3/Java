package cosc2006assignment1;

import java.util.LinkedList; // importing the LinkedList package

public class LinkedListCollectionFramework {
    public static void main(String[] args) { // main method 
                LinkedList<Integer> numbers = new LinkedList<Integer>(); // creating an object for the linkedList of integers 
        numbers.add(1); // adding 1 to the linked list using add() function
        numbers.add(2); // adding 2 to the linked list using add() function
        numbers.add(3); // adding 3 to the linked list using add() function
        numbers.add(40); // adding 40 to the linked list using add() function
        numbers.add(80); // adding 80 to the linked list using add() function
        numbers.addFirst(20); // adding 20 at the beginning of the  linked list using add() function
        numbers.addLast(90); // adding 90 at the end of the linked list using add() function
        numbers.set(2, 30); // setting the value of element at index 2 as 30 using the set() function
        numbers.remove(4); // removing the element at index 4 using the remove() function
        numbers.removeFirst(); // removing the first element using the remove() function
        numbers.removeLast(); // removing the last element using the remove() function
        for (int i = 0; i < numbers.size(); i++) { // •	Iterating over elements 
            System.out.println("element at index " + i + " is " + numbers.get(i)); // printing the elements and their indexes
        }
        System.out.println("Modified LinkedList is  " + numbers); // printing the new modified LinkedList
    }
}
