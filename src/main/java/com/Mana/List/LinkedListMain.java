package com.Mana.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    //DoubleLinked List
    //Not Synchronized
    public static void main(String[] args) {
        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);


        LinkedList<Dog> list=new LinkedList<Dog>();
        list.addFirst(d1);
        list.addFirst(d2);
        list.addFirst(d3);

        list.addLast(d4);

        //Iterator
        Iterator iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        list.removeFirst();
        list.removeLast();
        iter=list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
