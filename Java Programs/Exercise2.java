package cosc2006assignment2;
import java.util.*; //importing package
public class Exercise2 { // defining class
    static class Stack { // defining stack class
        static Queue<Integer> q1 = new LinkedList<Integer>(); // creating object for the queue1
        static Queue<Integer> q2 = new LinkedList<Integer>(); // creating object for the queue2

        void push(int x) { // defining the push method
            while (!q1.isEmpty()) { // checking if q1 is empty
                q2.add(q1.poll()); //moving elements form q1 to q2
            }
            q1.add(x); // adding elements to q1
            System.out.println(" The Element added to the stack is  " + x); // printing the elements
            while (!q2.isEmpty()) { // checking if q2 is empty
                q1.add(q2.poll()); //moving elements back form q2 to q1
            }
        }

        int pop() { // defining the pop method
            int popElement= q1.poll(); // removing elements from q1 and storing them in popElement
            System.out.println("The poped elemet is  " + popElement); // printing the removed element
            return popElement;    // returning the popped element        
        }
        int top() { // defining the top method
        	return q1.peek(); // returns the top element of the stack
        	
        }
    }

    public static void main(String[] args) { // defining the main method
        Stack s = new Stack(); // object creation
        s.push(1); //pushing element onto the stack
        s.push(2); //pushing element onto the stack
        s.push(3); //pushing element onto the stack
        s.push(4); //pushing element onto the stack
        s.push(5); //pushing element onto the stack
        s.pop(); // poping the element from the stack
        System.out.println("The element at the top is " + s.top()); // printing the top element of the stack
    }
}
