package com.Mana.Tree.BinarySearchTree;

public class Tree {
    TreeNode root;

    public void insert(int value){
        if(root==null){
            root=new TreeNode(value);
        }else {
            root.insert(value);
        }
    }

    public TreeNode search(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }

    public int getMin(){
        if(root!=null){
            return root.minData();
        }
        return Integer.MIN_VALUE;
    }

    public int getMax(){
        if(root!=null){
            return root.maxData();
        }
        return Integer.MAX_VALUE;
    }

    public void delete(int value){
        root=delete(root,value);
    }

    private TreeNode delete(TreeNode subtree,int value){
        if(subtree==null)return subtree;
        //Searching Node
        if(value<subtree.getData()){
            subtree.setLeft(delete(subtree.getLeft(),value));
        }else if(value>subtree.getData()){
            subtree.setRight(delete(subtree.getRight(),value));
        }
        //Encontro el nodo
        else {
            //Case 0,1: Node has 0/1 children
            if(subtree.getLeft()==null){
                return subtree.getRight();
            }
            else if (subtree.getRight()==null){
                return subtree.getLeft();
            }
            //Case 3:Node has two children
            //Replace value with Right Subtree
            subtree.setData(subtree.getRight().minData());
            subtree.setRight(delete(subtree.getRight(), subtree.getData()) );



        }

        //If node is not the one we wanna delete, the same is returned without changes
        return subtree;


    }

}
