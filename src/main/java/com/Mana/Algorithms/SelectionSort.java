package com.Mana.Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("------------------Selection Sorting------------------");
        //O(n**2), unstable
        int[] selection={20,35,-15,7,55,1,-22};
        for(int last=selection.length-1;last>0;last-- ){
            int largest=0;
            for(int i=0;i<last;i++){
                if(selection[i]>largest){
                    largest=i;
                }
            }
            swap(selection,largest,last);
        }
        for(int ele:selection){
            System.out.print(ele+",");
        }

        System.out.println("------------------Insertion Sorting------------------");
        //O(n**2), stable
        int[] insertion={20,35,-15,7,55,1,-22};


    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
