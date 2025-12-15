package com.BridgeLabz.Linkedlist;

public class Main {
    public static void main(String[] args) {

       Stack<Integer> st=new Stack<>();
       st.push(5);
       st.push(40);
       st.push(10);
       System.out.println(st.pop());
       st.display();
       System.out.println(st.isEmpty());
    }
}