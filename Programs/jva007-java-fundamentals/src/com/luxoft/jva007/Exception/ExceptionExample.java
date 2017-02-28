package com.luxoft.jva007.Exception;

/**
 * Created by ptcvas3 on 2/28/2017.
 */
public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Start");
        starpob();
    }
        static void starpob() {
            System.out.println("starpob: Clean room!");
            bocman();
            System.out.println("Room is OK");

        }

    static void bocman() {
        System.out.println("bocman: Clean room!");
        try {
            matros();
        } catch (ArithmeticException e){
            System.out.println("Hide the model");
        }
        System.out.println("Room is OK");
    }

    static void matros() {
        System.out.println("matros: Clean room!");
        junga();

        System.out.println("Room is OK");
    }

    static void junga() {
        int a = 10/0;
        System.out.println("OK");
    }
}
