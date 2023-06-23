package com.Mana.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={20,35,-15,7,55,1,-22};

        mergesort(array,0,array.length);
        //Printing
        for(int item:array){
            System.out.print(item+",");
        }
    }

    public static void mergesort(int[] arr,int start, int end){
        //Break recursion   ->  1 Element Array
        if(end-start<2)return;

        //Partiotioning
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start, int mid, int end){
        if(arr[mid-1]<=arr[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp=new int[end-start];
        //Sorting two arrays
        while (i<mid&&j<end){
            if(arr[i]<=arr[j]){
                temp[tempIndex]=arr[i];
                i++;
            }else {
                temp[tempIndex]=arr[j];
                j++;
            }
            tempIndex++;
        }
        //Last Item Left
        System.arraycopy(arr,i,arr,start+tempIndex,mid-i);
        //Pasting Sorted Array
        System.arraycopy(temp,0,arr,start,tempIndex);

    }
}
