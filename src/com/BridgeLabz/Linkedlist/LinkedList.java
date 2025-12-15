package com.BridgeLabz.Linkedlist;

public class LinkedList <T>{
    private Node<T> head=null;
    private Node<T> tail=null;
    private int size;

    public void addFirst(T data){
        Node<T> node=new Node<>(data);
        if(head==null ){
            head=tail=node;
        }
        else{
            node.setNext(head);
            head.setPre(node);
            head=node;
        }
        size++;

    }

    public void addLast(T data){
        Node<T> node=new Node<>(data);
        if(tail==null){
            head=tail=node;
        }
        else {
            tail.setNext(node);
            node.setPre(tail);
            tail=node;
        }
        size++;
    }


    public void addAtIndex(int index,T data){

        if(index<0 || index>size){
            System.out.println("Invalid index");
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size){
            addLast(data);
            return;
        }
        Node<T> current=head;

        for(int i=0;i<index;i++){
            current=current.getNext();
        }
        Node<T> node=new Node<>(data);
        node.setNext(current.getNext());
        node.setPre(current);
        current.getNext().setPre(node);
        current.setNext(node);

        size++;

    }


    public T removeFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return null;
        }
        T value=head.getData();
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.getNext();
            head.setPre(null);
        }
        size--;
        return value;

    }


    public T removeLast(){
        if(tail==null){
            System.out.println("List is Empty");
            return null;
        }
        T value=tail.getData();

        if(head==tail){
            head=tail=null;
        }
        else{
            tail=tail.getPre();
            tail.setData(value);
        }
        size--;
        return value;

    }


    public T removeAtIndex(int index){
        if(index<0 || index>size){
            System.out.println("Invalid Index");
        }
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        T value = current.getData();

        current.getPre().setNext(current.getNext());
        current.getNext().setPre(current.getPre());

        size--;
        return value;

    }


    public void forwardDisplay(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getNext();
        }
//        System.out.print("null");

    }


    public void backwardDisplay(){
        Node<T> temp=tail;
        while(temp!=null){
            System.out.print(temp.getData()+",");
            temp=temp.getPre();
        }
        System.out.print("null ]");


    }


    public int size(){
        return size;
    }


}
