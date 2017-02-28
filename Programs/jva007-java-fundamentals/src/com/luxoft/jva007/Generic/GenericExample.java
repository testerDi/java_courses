package com.luxoft.jva007.Generic;

import java.util.ArrayList;

/**
 * Created by ptcvas3 on 2/28/2017.
 */
public class GenericExample {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        //System.out.println(list.size());
        //printToConsole(list);
        Integer[] ints = {1, 2, 3};
        Integer first = getFirstElement(ints);
        Integer first2 = (Integer) getFirstElement2(ints);
        System.out.println(first + first2);
    }

    static  <T> T getFirstElement(T[] arr){
        return  arr[0];
    }

    static Object getFirstElement2(Object[] arr){
        return  arr[0];
    }
    /*
    static <T> T printToConsole(T arg){
        System.out.println(arg.toString());
        return arg;
    }
    static Object  printToConsole2(Object o){
        System.out.println(o.toString());
        return o;
    }*/
}
