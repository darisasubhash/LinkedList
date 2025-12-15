package com.BridgeLabz.Linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addAtIndex(0,25);
        list.addLast(10);
        list.forwardDisplay();
    }
}