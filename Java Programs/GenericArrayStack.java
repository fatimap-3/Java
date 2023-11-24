package sem3cosc2006;

class GenericArrayStack<T> implements StackInterface<T> {
 private Object[] array;
 private int size;
 private static final int DEFAULT_CAPACITY = 10;

 public GenericArrayStack() {
     array = new Object[DEFAULT_CAPACITY];
     size = 0;
 }

 @Override
 public boolean isEmpty() {
     return size == 0;
 }

 @Override
 public void push(T item) {
     ensureCapacity();
     array[size++] = item;
 }

 @Override
 @SuppressWarnings("unchecked")
 public T pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     T item = (T) array[--size];
     array[size] = null; 
     return item;
 }

 @Override
 public void popAll() {
     while (!isEmpty()) {
         pop();
     }
 }

 @Override
 @SuppressWarnings("unchecked")
 public T peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty");
     }
     return (T) array[size - 1];
 }

 private void ensureCapacity() {
     if (size == array.length) {
         int newCapacity = array.length * 2;
         array = java.util.Arrays.copyOf(array, newCapacity);
     }
 }
}