package com.app;

/**
 * Created by s.mayank on 21/10/16.
 */
public class BinarySearch {
    public boolean binarySearch(int[] a, int data){
        int start = 0;
        boolean b = false;
        int end = a.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            int point = a[mid];
            if(point == data){
                b = true;
                break;
            }
            else if(data < point){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return b;
    }
}
