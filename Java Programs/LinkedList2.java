package cosc2006classwork;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(40);
		numbers.add(80);
		numbers.addFirst(20);
		numbers.addLast(90);
		numbers.removeFirst();
		numbers.getFirst();
		numbers.getLast();
		System.out.println(numbers);
		
	}

}
package cosc2006classwork;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // Adding elements using add(), addFirst(), and addLast()
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(40);
        numbers.add(80);
        numbers.addFirst(20);
        numbers.addLast(90);

        // Updating elements using set()
        numbers.set(2, 30); // Update the element at index 2 to 30

        // Removing elements using remove(), removeFirst(), and removeLast()
        numbers.remove(4); // Remove the element at index 4
        numbers.removeFirst(); // Remove the first element
        numbers.removeLast(); // Remove the last element

        // Iterating over elements using get() and for-each loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        // Printing the LinkedList
        System.out.println("Updated LinkedList: " + numbers);
    }
}

