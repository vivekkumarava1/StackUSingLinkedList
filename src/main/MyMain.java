package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(100);
        stack.push(200);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(200);
        stack.push(100);
        stack.push(200);

        stack.traverse();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.traverse();
        System.out.println(stack.peek() + " is the top element in stack");
    }
}
