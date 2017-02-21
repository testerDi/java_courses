package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/20/2017.
 */
public class PrimitiveExample {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
       int  c = foo(a, b);
        System.out.println("a = " + a + ", b = " + b+ ", c = " + c);
        int nums[] = new int[2];
    }

    static int foo(int x, int y){
        x = 15;
        int r = x + y;
        return r;
    }
    static void boo(int[] ints){
        ints[1] = 10;
    }
}
