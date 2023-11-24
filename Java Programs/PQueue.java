package cosc2006assignment2;
import java.util.*;//importing the package
import java.util.PriorityQueue;//importing the package
public class PQueue { //defining class

	public static void main(String[] args) { // main method
		PriorityQueue<Integer> Q1 = new PriorityQueue<>(); // object creation
		Q1.add(1); // adding element to the queue
		Q1.add(17); // adding element to the queue
		Q1.add(40); // adding element to the queue
		Q1.add(52); // adding element to the queue
		Q1.add(76); // adding element to the queue
		System.out.println("The elements of the queue are :" + Q1); // printing the elements of the queue
		System.out.println("The element at the peek is " + Q1.peek()); // printing the top element of the queue
		System.out.println(Q1.poll()); // removing and printing the element 
		System.out.println(Q1.poll()); // removing and printing the element 
		System.out.println(Q1.poll()); // removing and printing the element 
		System.out.println(Q1.poll()); // removing and printing the element 
		Q1.poll(); // removing the element 
		
	}

}
