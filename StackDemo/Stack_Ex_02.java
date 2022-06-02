package StackDemo;

import java.util.Stack;

public class Stack_Ex_02 {
    public static void main(String[] args) {
       // Stack <Integer> stk = new Stack<Integer>();  - for integer type

        //Default stack     - for any type of value
        Stack stk = new Stack<>();

        stk.push("Tejas");
        stk.push("More");
        stk.push(162336);

        System.out.println("Original " + stk);

        System.out.println("Look " + stk.peek());

        System.out.println("Remove Element " + stk.pop());
        System.out.println(stk);
    }
}
