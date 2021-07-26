package com.Mana.Stacks.StackList;

import com.Mana.Dog;
import com.Mana.Stacks.StackArray.ArrayStack;

public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);


        LinkedStack stack=new LinkedStack();
        stack.push(d1);
        stack.push(d2);
        stack.push(d3);
        stack.push(d4);

        stack.printStack();



    }
}
