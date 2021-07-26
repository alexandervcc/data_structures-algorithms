package com.Mana.LinkedList.DoubleLinkedList;


public class Main {
    public static void main(String[] args) {

        DoubleLinkedDogs list=new DoubleLinkedDogs();

        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);


        list.addFront(d1);
        list.addFront(d2);
        list.addFront(d3);
        list.printList();

        list.addEnd(d4);

        list.printList();

        System.out.println("\nRemovedF:"+list.removeFront());
        list.printList();
        System.out.println("\nRemovedE:"+list.removeEnd());


        list.printList();




    }
}
