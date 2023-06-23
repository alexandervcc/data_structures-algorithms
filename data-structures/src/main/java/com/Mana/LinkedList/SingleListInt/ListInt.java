package com.Mana.LinkedList.SingleListInt;

public class ListInt {
    private Node head;
    private int size;

    public ListInt(){
        this.head=null;
        this.size=0;
    }

    public void addItem(int data){
        Node node = new Node(data);
        //Vacio
        if(head==null){
            head=node;
            return;
        }
        //Menor al inicio
        if(head.getData()>data){
            node.next=head;
            head=node;
            return;
        }
        Node pre=head;
        Node cur=head;
        while(cur!=null&&data>cur.getData()){
            pre=cur;
            cur=cur.next;
        }
        node.next=cur;
        pre.next=node;
    }

    public void printList(){
        Node current=head.getNext();
        System.out.print("  HEAD: "+head.getData());
        while(current!=null){
            System.out.print(", "+current.getData());
            current=current.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }



}
