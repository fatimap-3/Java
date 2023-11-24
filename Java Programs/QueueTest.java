package sem3cosc2006;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>(10);
        System.out.println("Adding names to the queue:");
        stringQueue.enqueue("Fatima");
        System.out.println("Queue after adding Fatima is " + stringQueue);
        stringQueue.enqueue("Hope");
        System.out.println("Queue after adding Hope is " + stringQueue);
        stringQueue.enqueue("Famu");
        System.out.println("Queue after adding Famu is  " + stringQueue);
        stringQueue.enqueue("Teddy Bear");
        System.out.println("Queue after adding Teddy Bear is  " + stringQueue);
        stringQueue.enqueue("Polar bear");
        System.out.println("Queue after adding Polar Bear is  " + stringQueue);
        stringQueue.enqueue("jane");
        System.out.println("Queue after adding Jane is " + stringQueue);
        stringQueue.enqueue("Janice");
        System.out.println("Queue after adding Janice is  " + stringQueue);
        stringQueue.enqueue("Aniston");
        System.out.println("Queue after adding Aniston is  " + stringQueue);
        stringQueue.enqueue("Emily");
        System.out.println("Queue after adding Emily is  " + stringQueue);
        stringQueue.enqueue("Stanley");
        System.out.println("Queue after adding Stanley is  " + stringQueue);
        System.out.println("\nRemoving names from the queue:");
        System.out.println("Queue after removing " + stringQueue.dequeue() + ": " + stringQueue);
        System.out.println("Queue after removing " + stringQueue.dequeue() + ": " + stringQueue);
        System.out.println("Queue after removing " + stringQueue.dequeue() + ": " + stringQueue);
        if (!stringQueue.isEmpty()) {
            System.out.println("\nItem at the start of the queue: " + stringQueue.peek());
            System.out.println("Number of items in the queue: " + stringQueue.size());
        } else {
            System.out.println("\nThe queue is empty.");
        }
    }
}


