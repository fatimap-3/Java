package sem3cosc2006;

public class DoubleNode<T extends Comparable<T>> {
    private T item;
    private DoubleNode<T> prev;
    private DoubleNode<T> next;

    public DoubleNode(T item) {
        this.item = item;
        this.prev = null;
        this.next = null;
    }

    public DoubleNode(DoubleNode<T> prev, T item, DoubleNode<T> next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setPrev(DoubleNode<T> node) {
        this.prev = node;
    }

    public DoubleNode<T> getPrev() {
        return prev;
    }

    public void setNext(DoubleNode<T> node) {
        this.next = node;
    }

    public DoubleNode<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return (prev != null ? prev.getItem().toString() : "null") +
               " <- " + item.toString() +
               " -> " + (next != null ? next.getItem().toString() : "null");
    }
}

