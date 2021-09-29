package com.Mana.HashTable.ArrayHash;

import com.Mana.Dog;

public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog("B","Nazi",4);
        Dog d2=new Dog("Cuicocha","Nazi",5);
        Dog d3=new Dog("bita","Nazi",6);
        Dog d4=new Dog("itas","Nazi",7);

        ArrayHash hasttable=new ArrayHash();

        hasttable.put(d1.getName(),d1);
        hasttable.put(d2.getName(),d2);
        hasttable.put(d3.getName(),d3);
        hasttable.put(d4.getName(),d4);


        hasttable.print();

        System.out.println(hasttable.get(d1 .getName()));
        System.out.println(hasttable.get(d3.getName()));
        System.out.println(hasttable.get(d4.getName()));



    }
}
