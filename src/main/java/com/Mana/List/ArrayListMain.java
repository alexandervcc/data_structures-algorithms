package com.Mana.List;

import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Dog> doggosList=new java.util.ArrayList<>();
        doggosList.add(new Dog("Manasitas","Sausage",1));
        doggosList.add(new Dog("Mijotron","Moustaceh",2));
        doggosList.add(new Dog("Cuicochas","Mix",3));
        Dog d1=new Dog("Babitas","Nazi",4);
        doggosList.add(d1);

        doggosList.forEach(doggo->
                System.out.println(doggo.toString()));

        doggosList.get(0);
        doggosList.isEmpty();
        doggosList.size();
        doggosList.set(1,new Dog("Kukito","Conde",5));
        doggosList.add(3,new Dog("Limon","Boxer",6));

        doggosList.forEach(doggo->
                System.out.println(doggo.toString()));

        //Convert to Array
        Dog [] dogArray=doggosList.toArray(new Dog[doggosList.size()]);

        System.out.println(doggosList.contains(d1));
        System.out.println(doggosList.indexOf(d1));
        doggosList.remove(2);

    }
}
