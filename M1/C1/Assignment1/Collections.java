package module1;

import java.util.*;
import java.util.LinkedList;

// Main class for working with different collections
public class DSAAssignment1 {

    // Array Operations
    public static void arrayOperations() {
        System.out.println("Array Operations:");
        int[] arr = {1, 2, 3, 4, 5};

        // Traversing the array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Inserting an element (at the end)
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = 6;
        System.out.println("After Insertion: " + Arrays.toString(arr));

        // Deleting an element (from the end)
        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("After Deletion: " + Arrays.toString(arr));
    }

    // Linked List Operations
    public static void linkedListOperations() {
        System.out.println("\nLinked List Operations:");
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Traversing the list
        System.out.println("Original Linked List: " + list);

        // Inserting an element (at the end)
        list.add(6);
        System.out.println("After Insertion: " + list);

        // Deleting an element (from the end)
        list.removeLast();
        System.out.println("After Deletion: " + list);
    }

    // Doubly Linked List Node
    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode prev;
        DoublyLinkedListNode next;

        DoublyLinkedListNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Doubly Linked List Operations
    static class DoublyLinkedList {
        DoublyLinkedListNode head;

        public void insertEnd(int data) {
            DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
            if (head == null) {
                head = newNode;
            } else {
                DoublyLinkedListNode temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
            }
        }

        public void deleteFront() {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        }

        public void display() {
            DoublyLinkedListNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Circular Linked List Node
    static class CircularLinkedListNode {
        int data;
        CircularLinkedListNode next;

        CircularLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Circular Linked List Operations
    static class CircularLinkedList {
        CircularLinkedListNode head = null;
        CircularLinkedListNode tail = null;

        // Insert at the end
        public void insert(int data) {
            CircularLinkedListNode newNode = new CircularLinkedListNode(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        // Delete from the front
        public void delete() {
            if (head == null) return;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        }

        // Display the circular linked list
        public void display() {
            CircularLinkedListNode current = head;
            if (head != null) {
                do {
                    System.out.print(current.data + " ");
                    current = current.next;
                } while (current != head);
            }
            System.out.println();
        }
    }

    // Main Method to Run Operations
    public static void main(String[] args) {
        arrayOperations();
        linkedListOperations();

        // Doubly Linked List Operations
        System.out.println("\nDoubly Linked List Operations:");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);
        dll.insertEnd(5);
        System.out.print("Original Doubly Linked List: ");
        dll.display();
        dll.deleteFront();
        System.out.print("After Deletion: ");
        dll.display();

        // Circular Linked List Operations
        System.out.println("\nCircular Linked List Operations:");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        System.out.print("Original Circular Linked List: ");
        cll.display();
        cll.insert(6);
        System.out.print("After Insertion: ");
        cll.display();
        cll.delete();
        System.out.print("After Deletion: ");
        cll.display();
    }
}



//output

Array Operations:
Original Array: [1, 2, 3, 4, 5]
After Insertion: [1, 2, 3, 4, 5, 6]
After Deletion: [1, 2, 3, 4, 5]

Linked List Operations:
Original Linked List: [1, 2, 3, 4, 5]
After Insertion: [1, 2, 3, 4, 5, 6]
After Deletion: [1, 2, 3, 4, 5]

Doubly Linked List Operations:
Original Doubly Linked List: 1 2 3 4 5 
After Deletion: 2 3 4 5 

Circular Linked List Operations:
Original Circular Linked List: 1 2 3 4 5 
After Insertion: 1 2 3 4 5 6 
After Deletion: 2 3 4 5 6 
