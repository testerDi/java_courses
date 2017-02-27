package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/27/2017.
 */

public class AnonExample {
    public static void main(String[] args) {
        class Flyer {
            void Fly() {
                System.out.println("I can Fly");
            }
        }

        Flyer f = new Flyer();
        f.Fly();

        Flyer o = new Flyer() {
            void Fly() {
                System.out.println("I can Fly!");
            }
        };
        o.Fly();
    }
}