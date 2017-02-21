package com.luxoft.jva007;

import java.util.Scanner;

/**
 * Created by ptcvas3 on 2/21/2017.
 */
public class array3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number i/j ");
        String n = scan.next();


        int num = Integer.parseInt(n);
        int[][] arr = new int[num][num];

        System.out.println("Insert array");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = scan.nextInt();
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }


        System.out.println("The end");


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) {
            for ( int j = i; j < arr.length; j++) {
                int k = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = k;

            }
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




