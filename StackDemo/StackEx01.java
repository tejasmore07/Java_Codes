package StackDemo;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {
        // main method
        Stack<String> stk = new Stack<String>();
        //creating an empty stack

        // Use push() to add elements
        stk.push("More");
        stk.push("Tejas");
        stk.push("Mr");

        // Displaying the stack
        System.out.println("Original stack is : " +  stk);

        // looking the element of top of the stack
        // Use peek() to look elements
        stk.peek();
        System.out.println("Look element at top : " + stk.peek());

        //Removing elements using pop()
        System.out.println("Remove elements at top : " + stk.pop());

        //print original stack
        System.out.println(stk);
    }
}
