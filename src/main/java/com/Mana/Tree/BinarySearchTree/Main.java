package com.Mana.Tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree();

        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(150);
        tree.insert(25);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(16);

        tree.insert(10);

        tree.insert(1);
        tree.insert(32);
        System.out.println("PRINTING_______________");
        tree.root.in_order();

        System.out.println("SEARCHING_______________");
        System.out.println(tree.search(20));
        System.out.println(tree.search(26));
        System.out.println(tree.search(100));
        System.out.println("MIN/MAX_______________");
        System.out.println("Min: "+tree.getMin());
        System.out.println("Max: "+tree.getMax());
        System.out.println("DELETE_______________");
        tree.delete(20);
        tree.root.in_order();


    }
}
