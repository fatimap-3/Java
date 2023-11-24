package sem3cosc2006;

public interface StackInterface <T> {
    public boolean isEmpty() ;
    public void push(T item);
    public T pop();
    public void popAll();
    public T peek(); 
    
}