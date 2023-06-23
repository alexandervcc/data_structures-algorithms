package com.Mana.LinkedList.SingleLinkedList;


public class Main {
    public static void main(String[] args) {

        ListDogs list=new ListDogs();

        Dog d1=new Dog("Babitas","Nazi",4);
        Dog d2=new Dog("abitas","Nazi",5);
        Dog d3=new Dog("bitas","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);

        System.out.println(list.isEmpty());
        list.addFront(d1);
        list.addFront(d2);
        list.addFront(d3);
        list.addFront(d4);

        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.printList();
        System.out.println("\n"+list.removeFront().toString());
        System.out.println(list.getSize());
        list.printList();



    }
}
