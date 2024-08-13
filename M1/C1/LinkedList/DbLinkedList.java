package com.ust.LP1.lesson2.LinkedList;

import java.util.Optional;

public class DbLinkedList<V> {
    private V value;
    private DbLinkedList<V> next;
    private DbLinkedList<V> previous;

    public DbLinkedList(V value,DbLinkedList<V> previous, DbLinkedList<V> next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Optional<DbLinkedList<V>> getNext(){return Optional.ofNullable(next);}
    public Optional<DbLinkedList<V>> getPrevious(){return Optional.ofNullable(previous);}

    public V getValue() {return value;}
    public DbLinkedList<V> setValue(V value) {
        this.value = value;
        return this;
    }

    public DbLinkedList<V> setNext(DbLinkedList<V> next) {
        this.next = next;
        return this;
    }

    public DbLinkedList<V> setPrevious(DbLinkedList<V> previous) {
        this.previous = previous;
        return this;
    }
    @Override
    public String toString() {
        return "LinkedListNode{value="+value+"}";
    }
}
