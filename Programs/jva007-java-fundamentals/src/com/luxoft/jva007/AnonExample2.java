package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/27/2017.
 */

class Swimmers {
    Swimmers(String name){
        System.out.println(name);
    }
    Swimmers(int age){}
}
public class AnonExample2 {

    public static void main(String[] args) {
        Swimmers s = new Swimmers(55){
            public void swim(){
                System.out.println("I can Swim!");
            }
        };

    }
}
