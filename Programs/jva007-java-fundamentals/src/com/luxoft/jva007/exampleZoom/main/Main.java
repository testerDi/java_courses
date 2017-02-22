package com.luxoft.jva007.exampleZoom.main;
import com.luxoft.jva007.exampleZoom.Zoom.*;
/**
 * Created by ptcvas3 on 2/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish();


        fish1.setName("Dianka ");
        fish1.setBoned(true);
        fish1.setSeaFish(true);

        fish1.swim();

        Insect insect1 = new Insect();
        insect1.setName("Flyer Diana ");
        insect1.setNum_of_Legs(4);
        insect1.setNum_of_Wings(10);
        insect1.fly(45, 456);


    }
}