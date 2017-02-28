package com.luxoft.jva007.Generic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ptcvas3 on 2/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<String , Shape> shapes = new HashMap<>();
        shapes.put("kruzochek", new Circle());
        shapes.put("trrr", new Triangle());

        Shape s = shapes.get("kruzochek");
        System.out.println(s);
    }




    static class Shape{}
    static class Circle extends Shape{}
    static class Triangle extends Shape{}

}
