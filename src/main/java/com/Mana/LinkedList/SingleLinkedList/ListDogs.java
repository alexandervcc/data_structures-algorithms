package com.Mana.LinkedList.SingleLinkedList;

public class ListDogs {
    private Node head;
    private int size;

    public ListDogs(){
        this.head=null;
        this.size=0;
    }

    public void addFront(Dog dog){
        Node node = new Node(dog);
        node.setNext(head);
        head=node;
        size++;

    }

    public void printList(){
        Node current=head;
        System.out.println("HEAD-->");
        while(current!=null){
            System.out.println(current.getDog().toString());
            System.out.print("  -->");
            current=current.getNext();
        }
        System.out.print("null");
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
        head=head.getNext();
        removed.setNext(null  );
        size--;
        return removed;
    }

}
