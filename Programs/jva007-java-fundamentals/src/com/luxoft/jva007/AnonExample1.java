package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/27/2017.
 */

        interface Swimmer {
            void swim();

}
public class AnonExample1 {
    public static void main(String[] args) {
        Swimmer s = new Swimmer() {
            @Override
            public void swim() {
                System.out.println("I can swim!");
            }

        };
        s.swim();

    }
}