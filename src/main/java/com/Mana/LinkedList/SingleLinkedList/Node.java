package com.Mana.LinkedList.SingleLinkedList;

public class Node {
    private Dog dog;
    private Node next;

    public Node(Dog dog) {
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node{" +
                "dog=" + dog +
                ", next=" + next +
                '}';
    }
}
