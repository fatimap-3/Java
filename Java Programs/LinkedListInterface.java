package sem3cosc2006;


	public interface LinkedListInterface<T> {
	    boolean isEmpty();
	    int size();
	    void insert(T item);
	    T remove(int i) throws LinkedListException;
	    void removeAll();
	    T get(int i) throws LinkedListException;
	}


