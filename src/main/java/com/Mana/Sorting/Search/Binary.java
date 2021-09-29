package com.Mana.Sorting.Search;

public class Binary {
    public static void main(String[] args) {
        int[] array={-22,-15,1,7,20,35,55};
    }

    public static int binarySearchIt(int[] array,int val){
        int start=0;
        int end=array.length;
        while(start<end){
            int mid=(start+end)/2;
            if(array[mid]==val){
                return mid;
            }else if(array[mid]<val){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return -1;
    }

    public static int binarySearchRe(int[] arr, int val,int start,int end){
        if(start>=end){
            return -1;
        }
        int mid=(end+start)/2;
        if(arr[mid]==val){
            return mid;
        }else if(arr[mid]<val){
            return binarySearchRe(arr,val,mid+1,end);
        }else {
            return binarySearchRe(arr,val,start,mid);
        }

    }
}
