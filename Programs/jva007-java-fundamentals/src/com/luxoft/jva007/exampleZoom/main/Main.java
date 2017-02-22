package com.luxoft.jva007.exampleZoom.main;
import com.luxoft.jva007.exampleZoom.Zoom.*;
/**
 * Created by ptcvas3 on 2/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        Insect insect1 = new Insect();

        fish1.setName("Dianka ");
        fish1.setBoned(true);
        fish1.setSeaFish(true);
        fish1.swim();
    }
}