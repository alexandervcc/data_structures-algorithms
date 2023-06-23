package com.Mana.LinkedList.DoubleLinkedList;


public class Main {
    public static void main(String[] args) {

        DoubleLinkedDogs list=new DoubleLinkedDogs();

        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);
        Dog d5=new Dog("Mana","XD",45);

        list.addFront(d1);
        list.addFront(d2);
        list.addFront(d3);
        list.addEnd(d4);


        list.printList();
        list.addBefore(d5,d1);

        list.printList();




    }
}
