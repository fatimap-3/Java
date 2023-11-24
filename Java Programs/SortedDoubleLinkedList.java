package sem3cosc2006;

public class SortedDoubleLinkedList<T extends Comparable<T>> implements LinkedListInterface<T> {
    private DoubleNode<T> head;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        int count = 0;
        DoubleNode<T> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public void insert(T item) {
        DoubleNode<T> newNode = new DoubleNode<>(item);
        if (isEmpty() || item.compareTo(head.getItem()) <= 0) {
            newNode.setNext(head);
            if (head != null) {
                head.setPrev(newNode);
            }
            head = newNode;
        } else {
            DoubleNode<T> current = head;
            while (current.getNext() != null && item.compareTo(current.getNext().getItem()) > 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            newNode.setPrev(current);
            if (current.getNext() != null) {
                current.getNext().setPrev(newNode);
            }
            current.setNext(newNode);
        }
    }

    @Override
    public T remove(int i) throws LinkedListException {
        if (isEmpty() || i < 0 || i >= size()) {
            throw new LinkedListException("Invalid index or empty list");
        }

        if (i == 0) {
            T removedItem = head.getItem();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            return removedItem;
        } else {
            DoubleNode<T> current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.getNext();
            }
            T removedItem = current.getNext().getItem();
            current.setNext(current.getNext().getNext());
            if (current.getNext() != null) {
                current.getNext().setPrev(current);
            }
            return removedItem;
        }
    }

    @Override
    public void removeAll() {
        head = null;
    }

    @Override
    public T get(int i) throws LinkedListException {
        if (isEmpty() || i < 0 || i >= size()) {
            throw new LinkedListException("Invalid index or empty list");
        }

        DoubleNode<T> current = head;
        for (int j = 0; j < i; j++) {
            current = current.getNext();
        }
        return current.getItem();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        DoubleNode<T> current = head;
        while (current != null) {
            result.append(current.getItem());
            if (current.getNext() != null) {
                result.append(" -> ");
            }
            current = current.getNext();
        }
        return result.toString();
    }
}
