package sem3cosc2006;

public interface QueueInterface<T> {
   
    public boolean isEmpty();

   
    public void enqueue(T item);

   
    public T dequeue();

  
    public void dequeueAll(); T peek();

    
    public int size();
}