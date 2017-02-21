package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/21/2017.
 */
public class Array {
    public static void main(String[] args){
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;

            System.out.println(arr[i]);

        }

        System.out.println(arr.length);
       // System.out.println(arr[6]);

    }
}
