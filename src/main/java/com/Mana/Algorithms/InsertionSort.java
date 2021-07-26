package com.Mana.Algorithms;

public class InsertionSort {
    public static void main(String[] args) {


        System.out.println("------------------Insertion Sorting------------------");
        //O(n**2), stable
        int[] insertion={20,35,-15,7,55,1,-22};

        for(int firstUnsorIndex=1;firstUnsorIndex<insertion.length;firstUnsorIndex++){
            int newElement=insertion[firstUnsorIndex];
            int i;
            for(i=firstUnsorIndex;i>0&&insertion[i-1]>newElement;i--){
                insertion[i]=insertion[i-1];
            }
            insertion[i]=newElement;

        }
        for(int ele:insertion){
            System.out.print(ele+",");
        }


    }


}
