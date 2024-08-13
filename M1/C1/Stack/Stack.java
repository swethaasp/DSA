package com.ust.LP1.lesson2.stack;
import com.ust.LP1.lesson2.LinkedList.LinkedListNode;
import java.util.Optional;
public class Stack<V> {
    public LinkedListNode<V> head;
    public Stack(){
        head=null;
    }
    public void push(V item){
        //        if(head != null) Optional.ofNullable(head).ifPresent(n -> n.setNext(node));
        head = new LinkedListNode<>(item, head);
    }
    public Optional<V> pop(){
        if (head == null) {
            return Optional.empty();
        }
        LinkedListNode<V> poped = head;
        head = head.getNext().orElse(null);
        return Optional.ofNullable(poped.getValue());
    }
    public Optional<V> peek(){
        return Optional.ofNullable(head).map(LinkedListNode::getValue);
    }

    public boolean isEmpty(){
        return head == null;
    }
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push("viswa");
        s.push("axel");
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.push("7");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}
