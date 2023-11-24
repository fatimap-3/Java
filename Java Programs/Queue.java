package sem3cosc2006;
import java.util.Arrays;

public class Queue<T> implements QueueInterface<T> {
    private T[] queueArray;
    private int size;
    private int maxSize;

    public Queue(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalStateException("Maximum size must be greater than zero");
        }
        this.maxSize = maxSize;
        this.queueArray = (T[]) new Object[maxSize];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(T item) {
        if (size == maxSize) {
            throw new IllegalStateException("Queue is full, cannot enqueue more elements");
        }
        queueArray[size++] = item;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cannot dequeue");
        }
        T item = queueArray[0];
        System.arraycopy(queueArray, 1, queueArray, 0, size - 1);
        size--;
        return item;
    }

    @Override
    public void dequeueAll() {
        Arrays.fill(queueArray, null);
        size = 0;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty, cannot peek");
        }
        return queueArray[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(queueArray[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
