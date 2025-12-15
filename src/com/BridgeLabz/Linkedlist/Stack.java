package com.BridgeLabz.Linkedlist;

public class Stack<T>{
    LinkedList<T> list=new LinkedList<>();

    public void push(T data){
        list.addFirst(data);

    }
    public T pop(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        return list.removeFirst();
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
    public  void display(){
        list.forwardDisplay();
    }


}
