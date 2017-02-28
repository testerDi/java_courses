package com.luxoft.jva007.Generic;

/**
 * Created by ptcvas3 on 2/28/2017.
 */
public class GenericExample2 {
    public static void main(String[] args) {
        Cage c = new Cage();
        c.put(new Duck("KryKry"));
        //Animal a = new Dog("Sharik");
        //((Dog ) a).woof();
    }

    static class Cage {
        Animal animal;

        void put(Animal a){
            animal = a;
        }
        Animal free(){
            Animal a = animal;
            animal = null;
            return a;
        }

    }
}
