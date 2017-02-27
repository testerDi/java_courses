package com.luxoft.jva007;

/**
 * Created by ptcvas3 on 2/27/2017.
 */
public class Ship {
 class Closet{

     //in what ship we are!
     public Ship getShip(){
         return Ship.this;
     }

}



public Closet closet;
Closet[] closets;
    public static void main(String[] args){
        Ship ship = new Ship();
        ship.closet = ship.new Closet();
        ship.closets = new Closet[10];
        ship.closets[0] = ship.new Closet();
        ship.closets[1] = ship.new Closet();
    }
}
