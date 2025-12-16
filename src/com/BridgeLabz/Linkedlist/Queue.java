package com.BridgeLabz.Linkedlist;

public class Queue<T> {
    LinkedList<T> list=new LinkedList<>();

    public void enqueue(T data){
        list.addLast(data);
    }
    public T dequeue(){
        return list.removeFirst();
    }
    public int Size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.size()==0;
    }
    public T peek(){
       return list.getFirst();
    }
}
