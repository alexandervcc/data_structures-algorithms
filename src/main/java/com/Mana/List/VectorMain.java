package com.Mana.List;

import java.util.List;
import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        List<Dog> doggosList=new Vector<>();
        doggosList.add(new Dog("Manasitas","Sausage",1));
        doggosList.add(new Dog("Mijotron","Moustaceh",2));
        doggosList.add(new Dog("Cuicochas","Mix",3));
        Dog d1=new Dog("Babitas","Nazi",4);
        doggosList.add(d1);

    }
}
