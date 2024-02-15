package co.edu.uptc.demo8.services;

import org.apache.poi.ss.formula.functions.T;

public class Node<T> {
    private T info;
    private Node<T> next;

    public Node() {
        next = null;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}