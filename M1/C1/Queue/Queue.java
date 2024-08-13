package com.ust.LP1.lesson2.queue;

import com.ust.LP1.lesson2.LinkedList.DbLinkedList;

import java.util.Optional;

public class Queue<V> {
    private DbLinkedList<V> head;
    private DbLinkedList<V> tail;
    private Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(V item){
        DbLinkedList<V> node = new DbLinkedList<>(item, tail, null);
        Optional.ofNullable(tail).ifPresent(n -> n.setNext(node));
        tail = node;
        if (head == null) head = node;
    }
    public Optional<V> dequeue(){
        Optional<DbLinkedList<V>> node = Optional.ofNullable(head);
        head = node.flatMap(DbLinkedList::getNext).orElse(null);
        Optional.ofNullable(head).ifPresent(n -> n.setPrevious(null));
        if (head == null) tail = null;
        return node.map(DbLinkedList::getValue);
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("Viswa");
        q.enqueue("axel");
        q.enqueue("jou");
        q.enqueue("full");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue("axel");

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
