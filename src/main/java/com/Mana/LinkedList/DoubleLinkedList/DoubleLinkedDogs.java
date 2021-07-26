package com.Mana.LinkedList.DoubleLinkedList;

public class DoubleLinkedDogs {
    private Node head,tail;
    private int size;

    public DoubleLinkedDogs(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void addFront(Dog dog){
        Node node = new Node(dog);
        node.setNext(head);
        if(head==null){
            tail=node;
        }else{
            head.setPrev(node);
        }
        head=node;
        size++;
    }

    public void addEnd(Dog dog){
        Node node=new Node(dog);
        if(tail==null){
            head=node;
        }else {
            tail.setNext(node);
            node.setPrev(tail );
        }
        tail=node;
        size++;
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public Node removeFront(){
        if(isEmpty()){
            return null;
        }
        Node removed=head;
        if(head.getNext()==null){
            tail=null;
        }else{
            head.getNext().setPrev(null);
        }
        head=head.getNext();
        removed.setNext(null);
        removed.setPrev(null);
        size--;
        return removed;
    }

    public Node removeEnd(){
        if(isEmpty()){
            return null;
        }
        Node removed=tail;
        if(tail.getPrev()==null){
            head=null;
        }else{
            tail.getPrev().setNext(null);
        }
        tail=tail.getPrev();
        removed.setNext(null);
        removed.setPrev(null);
        size--;
        return removed;
    }

    public void printList(){
        Node current=head;
        System.out.println("HEAD-->");
        while(current!=null){
            System.out.println(current.getDog().toString());
            System.out.print("  <=>");
            current=current.getNext();
        }
        System.out.print("null");
    }
}
