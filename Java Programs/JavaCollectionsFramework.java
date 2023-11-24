package cosc2006classwork;
import java.util.LinkedList;
import java.util.Queue;
public class JavaCollectionsFramework {
	public static void main(String args[]) {
		Queue<String> queue = new LinkedList<>();{
			queue.offer("I");
			queue.offer("am");
			queue.offer("at");
			queue.offer("Algoma");
			queue.offer("University");
			System.out.println("The initial queue is " + queue);
			queue.poll();
			queue.poll();
			queue.poll();
			System.out.println("Queue after the dequeue operation is "+ queue);
		}
		
		
		
	}

}
