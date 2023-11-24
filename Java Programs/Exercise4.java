package cosc2006assignment2;

public class Exercise4 { // defining the class
    private Node front; //Referencing the front of the queue
    private Node rear; // Referencing the rear of the queue
    private class Node { // defining node class
        String data; // data part of a node
        Node next; // address of the next node

        Node(String data) { //constructor 
            this.data = data;
            this.next = null;
        }
    }
    public void enqueue(String data) { // Enqueue method to add an element to the queue
    	if(front == null) { // checking if the queue is empty
    		rear = new Node(data); // creating a new node
    		front=rear; // setting both front and rear to the new node
    	}
    	else {
    		rear.next=new Node(data); // adding a new node to the end of the queue
    		rear=rear.next; // updating the rear reference
    	}
    	System.out.println(data); //printing element
    }
    public void dequeue() { // Dequeue method to remove an element from the queue
    	if(front!=null) { // checking if the queue is not empty
    		String result = front.data; // storing the data of the front node
    		front=front.next; // updating the front reference to the next node
    		System.out.println("The element that is removed is " + result); // printing the removed element
    	}
    	else {
    		System.out.println("Underflow. No elements to be removed."); // printing the statement
    	}
    }
    	public static void main(String[] args) { //defining the main method
    		Exercise4 e=new Exercise4(); //object creation
    		e.enqueue("I"); // adding element to the queue
    		e.enqueue("AM"); // adding element to the queue
    		e.enqueue("AT"); // adding element to the queue
    		e.enqueue("Algoma"); // adding element to the queue
    		e.enqueue("University"); // adding element to the queue
    		e.enqueue("Brampton"); // adding element to the queue
    		e.enqueue("Campus"); // adding element to the queue
    		e.dequeue(); // removing element from the queue
    		e.dequeue(); // removing element from the queue
    		e.dequeue(); // removing element from the queue
    		
    	}
    }

