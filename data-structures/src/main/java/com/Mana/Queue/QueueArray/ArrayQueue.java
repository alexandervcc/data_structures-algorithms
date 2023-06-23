package com.Mana.Queue.QueueArray;

import com.Mana.Dog;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Dog[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue=new Dog[capacity];

    }

    public void add(Dog input){
        if(back==queue.length){
            Dog[] temp=new Dog[2*queue.length];
            System.arraycopy(queue,0,temp,0,queue.length);
            queue=temp;
        }
        queue[back]=input;
        back++;
    }

    public Dog remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Dog remove=queue[front];
        queue[front]=null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }
        return remove;
    }

    public Dog peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        return queue[front];
    }

    public int size(){
        return back-front;
    }

    public void printQueue(){
        for(int i=front;i<back;i++){
            System.out.println(queue[i]);
        }
    }

}
