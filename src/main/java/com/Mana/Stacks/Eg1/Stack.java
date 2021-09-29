package com.Mana.Stacks.Eg1;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Character> stack;
    //LinkedList is double Linked
    public Stack(){
        stack=new LinkedList<>();
    }

    public void push(char input){
        stack.push(input);
    }

    public java.lang.Character pop(){
        return stack.pop();
    }

    public java.lang.Character peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void clear(){
        stack.clear();
    }

    public void printStack(){
        for(java.lang.Character d:stack){
            System.out.print(d);
        }
    }
}