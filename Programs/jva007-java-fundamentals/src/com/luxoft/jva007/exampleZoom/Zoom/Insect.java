package com.luxoft.jva007.exampleZoom.Zoom;

/**
 * Created by ptcvas3 on 2/22/2017.
 */
public class Insect {
     private int num_of_Wings;
     private int num_of_Legs;

    public String fly(){
        return "I can fly";
    }

    public int getNum_of_Wings(){
        return this.num_of_Wings;}

    public  void getseaFish(int value){
        this.num_of_Wings = value ;
    }

    public int getNum_of_Legs(){
        return this.num_of_Legs;}

    public  void getboned(int value){
        this.num_of_Legs = value ;
    }
}
