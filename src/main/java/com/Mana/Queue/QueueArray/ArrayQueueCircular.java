package com.Mana.Queue.QueueArray;

import com.Mana.Dog;

import java.util.NoSuchElementException;

public class ArrayQueueCircular {
    private Dog[] queue;
    private int front;
    private int back;

    public ArrayQueueCircular(int capacity){
        queue=new Dog[capacity];

    }

    public void add(Dog input){
        if(size()==queue.length-1){
            int numItems=size();
            Dog[] temp=new Dog[2*queue.length];

            System.arraycopy(queue,front,temp,0,queue.length-front);
            System.arraycopy(queue,0,temp,queue.length-front, back);


            queue=temp;
            front=0;
            back=numItems;
        }
        queue[back]=input;
        if(back<queue.length-1){
            back++;
        }else {
            back=0;
        }
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
        }else if(front==queue.length){
            front=0;
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
        if(front<=back){
            return back-front;
        }else {
            return back-front+queue.length;
        }
    }

    public void printQueue(){
        if(front<back){
            for(int i=front;i<back;i++){
                System.out.println(queue[i]);
            }
        }else {
            for(int i=front;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            for(int i=0;i<back;i++){
                System.out.println(queue[i]);
            }
        }
    }

}
