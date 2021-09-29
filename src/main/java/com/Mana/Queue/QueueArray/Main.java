package com.Mana.Queue.QueueArray;

import com.Mana.Dog;

public class Main {
    //O(n) ->   Copy Array
    public static void main(String[] args) {
        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);

        ArrayQueue queue=new ArrayQueue(2);


        System.out.println(queue.size());

        queue.add(d1);
        queue.add(d2);
        queue.add(d3);
        queue.add(d4);
        queue.remove();
        queue.printQueue();
        System.out.println(queue.size());
        System.out.println();
        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.remove();



    }
}
