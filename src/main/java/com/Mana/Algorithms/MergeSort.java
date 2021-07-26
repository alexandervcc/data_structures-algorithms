package com.Mana.Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("------------------Merge Sorting------------------");
        //Recusrion + Divide and Conquer
        // O(nlogn), stable
        int[] merge={20,35,-15,7,55,1,-22,5,100,-8};
        System.out.println(merge.length);

        mergesort(merge,0,merge.length);

        for(int ele:merge){
            System.out.print(ele+",");
        }
    }

    public static void mergesort(int[] array, int start, int end){
        //One element Array
        if(end-start<2){
             return ;
        }
        int mid=(start+end)/2;
        //First Half
        mergesort(array,start,mid);
        //Second Half
        mergesort(array,mid,end);
        //Sort
        merge(array,start,mid,end);
    }

    public static void merge(int[] input,int start, int mid, int end){
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp=new int[end-start];
        while(i<mid&&j<end){
            temp[tempIndex++]=input[i]<=input[j]?input[i++]:input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);

    }
}
