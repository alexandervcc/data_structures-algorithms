package com.Mana.Stacks.StackArray;

import com.Mana.Dog;

import java.util.EmptyStackException;

public class ArrayStack {
    private Dog[] dogs;
    private int top;

    public ArrayStack(int cap){
        this.dogs=new Dog[cap];
    }

    public void push(Dog dogIn){
        if(top==dogs.length){
            //resize the array
            Dog[] newArray=new Dog[dogs.length*2];
            //Copy to another Array
            System.arraycopy(dogs,0,newArray,0,dogs.length);
            dogs=newArray;
        }
        dogs[top++]=dogIn;
    }
    public boolean isEmpty(){
        return top==0;
    }

    public Dog pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Dog recover=dogs[--top];
        dogs[top]=null;
        return recover;
    }

    public Dog peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return dogs[top-1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(dogs[i]);
        }
    }


}
