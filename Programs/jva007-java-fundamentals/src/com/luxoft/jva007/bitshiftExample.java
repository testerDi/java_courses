package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/21/2017.
 */
public class bitshiftExample {
    public static void main(String[] args) {

        int mask = 0xFF000000;
        int i = mask >> 16;
        int j = mask >> 24;
        int k = mask >> 32;

        System.out.println("i = " + Integer.toHexString(i));
        System.out.println("j = " + Integer.toHexString(j));
        System.out.println("k = " + Integer.toHexString(k));
    }
}
