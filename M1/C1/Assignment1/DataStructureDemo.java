
package module1;
import java.util.LinkedList;
import java.util.*;

public class DataStructureDemo {

    // Queue Operations
    public static void queueOperations() {
        System.out.println("Queue Operations:");
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue after enqueue operations: " + queue);
        
        // Dequeue elements
        System.out.println("Dequeued element: " + queue.poll());
        System.out.println("Queue after dequeue operation: " + queue);
    }

    // Stack Operations
    public static void stackOperations() {
        System.out.println("\nStack Operations:");
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack after push operations: " + stack);
        
        // Pop elements
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);
    }

    // LinkedList Operations
    public static void linkedListOperations() {
        System.out.println("\nLinkedList Operations:");
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Traverse the list
        System.out.println("Original LinkedList: " + linkedList);
        
        // Insert at the end
        linkedList.add(6);
        System.out.println("LinkedList after insertion at the end: " + linkedList);
        
        // Remove from the start
        linkedList.removeFirst();
        System.out.println("LinkedList after removal from the start: " + linkedList);
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

    // ArrayList Operations
    public static void arrayListOperations() {
        System.out.println("\nArrayList Operations:");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Add elements
        arrayList.add(6);
        arrayList.add(7);
        System.out.println("ArrayList after adding elements: " + arrayList);
        
        // Remove an element
        arrayList.remove(Integer.valueOf(4));
        System.out.println("ArrayList after removing element 4: " + arrayList);
    }

    // HashSet Operations
    public static void hashSetOperations() {
        System.out.println("\nHashSet Operations:");
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Add elements
        hashSet.add(6);
        hashSet.add(7);
        System.out.println("HashSet after adding elements: " + hashSet);
        
        // Remove an element
        hashSet.remove(3);
        System.out.println("HashSet after removing element 3: " + hashSet);
    }

    // Main Method to Run All Operations
    public static void main(String[] args) {
        queueOperations();
        stackOperations();
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
        System.out.print("After Deletion from Front: ");
        dll.display();

        arrayListOperations();
        hashSetOperations();
    }
}


output


  Queue Operations:
Queue after enqueue operations: [1, 2, 3]
Dequeued element: 1
Queue after dequeue operation: [2, 3]

Stack Operations:
Stack after push operations: [1, 2, 3]
Popped element: 3
Stack after pop operation: [1, 2]

LinkedList Operations:
Original LinkedList: [1, 2, 3, 4, 5]
LinkedList after insertion at the end: [1, 2, 3, 4, 5, 6]
LinkedList after removal from the start: [2, 3, 4, 5, 6]

Doubly Linked List Operations:
Original Doubly Linked List: 1 2 3 4 5 
After Deletion from Front: 2 3 4 5 

ArrayList Operations:
ArrayList after adding elements: [1, 2, 3, 4, 5, 6, 7]
ArrayList after removing element 4: [1, 2, 3, 5, 6, 7]

HashSet Operations:
HashSet after adding elements: [1, 2, 3, 4, 5, 6, 7]
HashSet after removing element 3: [1, 2, 4, 5, 6, 7]
