package cosc2006classwork;

public class LinkedList3 {

    private Node head;
    private int size;

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList3() {
        head = null;
        size = 0;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(String data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedList3 l3 = new LinkedList3();
        l3.add("hi");
        l3.add("how");
        l3.add("are");
        l3.add("you");
        l3.add("?");

        System.out.println("the Linked list is " + l3);

        l3.remove("hi");
        l3.add("i");
        l3.add("am");
        l3.add("okay");

        System.out.println("the new linked list is " + l3);
    }
}

