package com.java.example;


/*class Stack{
    private int size;
    private int[] stackAr;
    private int top;

    public Stack(int size){
        this.size = size;
        stackAr = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top== size-1);
    }

    public void push(int value){
        if(isFull()){
            throw new StackFullException("Cannot push "+value+", Stack is full");
        }
        stackAr[++top] = value;
    }

    public int pop(){
        if(isEmpty()){
            throw new StackEmptyException("Stack is empty");
        }
        return stackAr[top--];
    }
}

class StackFullException extends RuntimeException {

    public StackFullException(){
        super();
    }

    public StackFullException(String message){
        super(message);
    }

}

class StackEmptyException extends RuntimeException {

    public StackEmptyException(){
        super();
    }

    public StackEmptyException(String message){
        super(message);
    }
}*/

public class StackExample {
    Stack stack = new Stack(10);
    /*stack.push(10);
    stack.pop();*/
}

