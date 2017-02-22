package com.luxoft.jva007.exampleZoom.Zoom;

import com.luxoft.jva007.exampleZoom.Interface.Flyer;

/**
 * Created by ptcvas3 on 2/22/2017.
 */
public class Insect extends Zoom implements Flyer {
     private int num_of_Wings;
     private int num_of_Legs;

    public int getNum_of_Wings(){
        return this.num_of_Wings;}

    public  void setNum_of_Wings(int value){
        this.num_of_Wings = value ;
    }

    public int getNum_of_Legs(){
        return this.num_of_Legs;}

    public  void setNum_of_Legs(int value){
        this.num_of_Legs = value ;
    }

    public void fly(){
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("My name is " + getName());
        System.out.println("I have legs "+ getNum_of_Legs());
        System.out.println("I have wings " + getNum_of_Wings());

    }

    @Override
    public void fly(int height, int distance) {
        fly();
        System.out.println("My height is " + height+" My distance is "+distance);
    }




}
