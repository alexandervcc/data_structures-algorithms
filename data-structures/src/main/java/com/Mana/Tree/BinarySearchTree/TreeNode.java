package com.Mana.Tree.BinarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode left,right;

    public TreeNode(int data) {
        this.data=data;
    }

    public void insert(int value){
        if(data==value){
            return;
        }
        if(value<data){
            if(left==null){
                left=new TreeNode(value);
            }else {
                left.insert(value);
            }
        }else{
            if (right == null) {
                right=new TreeNode(value);
            }else {
                right.insert(value);
            }
        }
    }



    public TreeNode  get(int value){
        if(value==data){
            return this;
        }
        if(value<data){
            if(left!=null) {
                return left.get(value);
            }
        }else{
            if(right!=null) {
                return right.get(value);
            }
        }
        return null;
    }

    public int minData(){
        while(left!=null){
            return left.minData();
        }
        return data;
    }

    public int maxData(){
        while (right!=null){
            return right.maxData();
        }
        return data;
    }

    public void delete(int data){

    }


    public void in_order(){
        if(left!=null)left.in_order();
        System.out.println("Data: "+data+", ");
         if(right!=null)right.in_order();

    }

    public void post_order(){
        if(left!=null){
            left.pre_order();
        }
        if(right!=null){
            right.pre_order();
        }
        System.out.println("Data: "+data+", ");
    }

    public void pre_order(){
        System.out.println("Data: "+data+", ");
        if(left!=null){
            left.pre_order();
        }
        if(right!=null){
            right.pre_order();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
