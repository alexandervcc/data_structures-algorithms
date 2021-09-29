package com.Mana.LinkedList.DoubleLinkedList;

public class Node {
    public Dog dog;
    public  Node next;
    public  Node prev;

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

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }


    @Override
    public String toString() {
        return "Node{" +
                "dog=" + dog +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}
