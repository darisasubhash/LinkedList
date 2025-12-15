package com.BridgeLabz.Linkedlist;

public class Node <T>{
    private T data;
    private Node <T> next;
    private Node <T> pre;

    public Node(T data) {
        this.data = data;
        this.next=next;
        this.pre=pre;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPre() {
        return pre;
    }

    public void setPre(Node<T> pre) {
        this.pre = pre;
    }
}
