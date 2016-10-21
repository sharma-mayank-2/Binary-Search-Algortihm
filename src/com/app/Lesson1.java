package com.app;

/**
 * Created by s.mayank on 21/10/16.
 */
public class Lesson1 {
    static int[] a = {-1,2,6,7,9,10};
    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        if(binarySearch.binarySearch(a, 10)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
}
