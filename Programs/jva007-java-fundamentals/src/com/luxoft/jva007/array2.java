package com.luxoft.jva007;
import java.util.Scanner;
/**
 * Created by ptcvas3 on 2/21/2017.
 */
public class array2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        String n = scan.next();
        int num = Integer.parseInt(n);
        int[] arr = new int[num] ;

        System.out.println("Insert array");
        for(int j = 0; j < num; j++){
            arr[j] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++){

            int k =  arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = k;


            System.out.println(arr[i]);
              i++;

            System.out.println(arr[i]);

        }

        //System.out.println(arr.length);
        // System.out.println(arr[6]);

    }
}
