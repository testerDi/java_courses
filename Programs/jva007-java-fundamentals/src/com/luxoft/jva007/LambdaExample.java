package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/27/2017.
 */
public class LambdaExample {
    public static void main(String[] args) {
        doTriple(new implemetnsSomething() {
            @Override
            public void doSmth(int i) {
                System.out.println("Hello" + i + "!");
            }
        });
        doTriple( i -> {
        System.out.println("Hello lambda!" + i);
        });
    }


    static void doTriple(implemetnsSomething obj){
        obj.doSmth(1);
        obj.doSmth(2);
        obj.doSmth(3);
    }
    interface implemetnsSomething{
        void doSmth(int i);
    }
}
