package cosc2006assignment1;
class Node {
    int data; // data or value part of the node
    Node next; // address or reference of the next element

    Node(int data) {  // constructor initializing a new node
        this.data = data;
        this.next = null;
    }
}
public class LinkedListt {

    public static Node head; // head or first element of the linked list
    public static void insertAtBeginning(int newData) { // method to insert a node at the beginning of the list
        Node newNode = new Node(newData); // creating a new node
        newNode.next = head; // setting the address of the new node to the current head
        head = newNode; // updating the head to the new node
    }
    public static void insertAtEnd(int newData) { // method to insert a new node at the end of the list
        Node newNode = new Node(newData); // creating a new node
        if (head == null) { // checking if the list is empty
            head = newNode; // setting the new node as the new head
            return;
        }
        Node last = head; 
        while (last.next != null) { // traversing to the end of the list
            last = last.next;
        }

        last.next = newNode; // setting the reference of the last node to the new one
    }
    public static void insertAfterNode(int prevData, int newData) { // method to insert a new node after a specific node in the list
        Node newNode = new Node(newData); // creating a new node
        Node temp = head; // 

        while (temp != null && temp.data != prevData) { //// traversing to the node with the specified data
            temp = temp.next;
        }

        if (temp == null) { // checking if the specified node is found or not. 
            System.out.println("Node with data " + prevData + " not found in the linked list."); // If not, printing this statement and returning
            return;
        }

        newNode.next = temp.next;  // Setting the address of the new node to the address of the specified node
        temp.next = newNode; // Setting the address of the specified node to the new node
    }
    public static void printLinkedList() { // method to traverse and print the list
        Node current = head; 
        while (current != null) {   // traversing and printing each node's data or the value
            System.out.print(current.data); // printing the values
            if (current.next != null) { 
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) { // main method 
        insertAtEnd(52); // passing 52 as an argument to the insertAtEnd method
        insertAtBeginning(9); // passing 9 as an argument to the insertAtBeginning method
        insertAtBeginning(40); // passing 40 as an argument to the insertAtBeginning method
        insertAtEnd(2); // passing 2 as an argument to the insertAtEnd method
        insertAfterNode(9, 10); // passing 9 and 10 as arguments to the insertAfterNode method
        System.out.print("Linked List: "); // printing the list
        printLinkedList();
    }
}

