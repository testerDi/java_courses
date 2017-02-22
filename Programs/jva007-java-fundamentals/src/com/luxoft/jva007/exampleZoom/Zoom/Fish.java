package com.luxoft.jva007.exampleZoom.Zoom;



/**
 * Created by ptcvas3 on 2/22/2017.
 */
public class Fish extends Zoom implements Swimmer {
    private boolean seaFish;
    private boolean  boned;


    public boolean getSeaFish(){
        return this.seaFish;
    }

        public  void setSeaFish(boolean value){
        this.seaFish = value ;
    }

    public boolean getBoned(){
        return this.boned;}

    public  void setBoned(boolean value){
        this.boned = value ;
    }

    public void swim(){
        System.out.println(getName()+"I can swim");
        System.out.println("I am from the sea "+ getSeaFish());
        System.out.println("I have a bone " + getBoned());
    }
    }
