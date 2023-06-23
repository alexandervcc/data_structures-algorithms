package com.Mana.Stacks.StackList;

import com.Mana.Dog;

import java.util.LinkedList;

public class LinkedStack {
    private LinkedList<Dog> stack;
    //LinkedList is double Linked
    public LinkedStack(){
        stack=new LinkedList<Dog>();
    }

    public void push(Dog input){
        stack.push(input);
    }

    public Dog pop(){
        return stack.pop();
    }

    public Dog peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public void printStack(){
        for(Dog d:stack){
            System.out.println(d);
        }
    }
}
