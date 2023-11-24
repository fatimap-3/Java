package cosc2006assignment2;

public class Exercise3 { //  defining class
	int front =-1; // initializing  front(acts as the front of queue) data field 
	int rear =-1; //initializing  rear(acts as the rear of queue) data field
	int capacity=5; //initializing capacity (size of the array) data field
	int[] queue = new int[capacity];//initializing array
	void enqueue(int x) { // defining enqueue method
		if(rear == capacity-1) { // checking if queue is full
			System.out.println("Overflow.Cannot add more elements."); // printing statement
		}
		else if(rear == -1 && front == -1) { //checking if queue is empty
			front =0; 
			rear=0;
		    queue[rear]=x; //adding elements in the queue from the rear
		}
		else {
			rear++; // shifting the rear
			queue[rear]=x; // adding elements in the queue from the rear
		}
	}
	void dequeue() { // defining dequeue method
		if(front == -1 && rear == -1) {  //checking if queue is empty
			System.out.println("UnderFlow. There are no element to remove."); //printing statement
		}
		else if(front==rear) { // checking if there is only one element in the queue
			front=rear=-1; // resetting front and rear as there will be no elements after removal
		}
		else{
			front++; // incrementing front to remove the front element
		}
	}
	void display(){ // defining display method
		int i;
		if(front == -1 && rear == -1) { // checking if the queue is empty
			System.out.println("The Queue is empty.No elements to display."); // printing elements
			}
		else {
			for( i = front;i<rear+1;i++) {
				System.out.println(queue[i]); // printing each element in the queue
			}
		
		}
	}
	public static void main(String args[]) { // main method
		Exercise3 e=new Exercise3(); // creating an instance of Exercise3 class
		e.enqueue(2); // adding element to the queue
		e.enqueue(3); // adding element to the queue
		e.enqueue(4); // adding element to the queue
		e.enqueue(5); // adding element to the queue
		e.enqueue(6); // adding element to the queue
		e.dequeue(); // removing an element from the queue
		e.display(); // displaying the elements in the queue
	}

}
