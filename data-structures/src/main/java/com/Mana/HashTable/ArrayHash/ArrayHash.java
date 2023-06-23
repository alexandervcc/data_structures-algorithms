package com.Mana.HashTable.ArrayHash;

import com.Mana.Dog;

public class ArrayHash {
    private StoredDog[] hastable;

    public ArrayHash() {
        hastable = new StoredDog[10];
    }

    private int hashkey(String key) {
        return key.length() % hastable.length;
    }

    public void put(String key, Dog value) {
        int hash = hashkey(key);
        if (occupied(hash)) {
            //Lineal probing
            int stop = hash;
            if (hash == hastable.length - 1) {
                hash = 0;
            } else {
                hash++;
            }
            while (occupied(hash) && hash != stop) {
                hash = (hash + 1) % hastable.length;
            }
        }
        if (occupied(hash)) {
            System.out.println("Collission");
        } else {
            hastable[hash] = new StoredDog(key, value);
        }
    }

    public Dog get(String key) {
        int hash = findKey(key);
        if(hash==-1){
            return null;
        }
        return hastable[hash].doggo;
    }

    private int findKey(String key) {
        int hash = hashkey(key);
        if (hastable[hash] != null && hastable[hash].key.equals(key)) {
            return hash;
        }

        int stop = hash;
        if (hash == hastable.length - 1) {
            hash = 0;
        } else {
            hash++;
        }
        while ( hash!=stop&&
                hastable[hash]!=null&&
                !hastable[hash].key.equals(key)) {
            hash = (hash + 1) % hastable.length;
        }

        if(stop==hash){
            return -1;
        }else {
            return hash;
        }

    }

    private boolean occupied(int index) {
        return hastable[index] != null;
    }

    public void print() {
        for (int i = 0; i < hastable.length; i++) {
            if(hastable[i]==null){
                System.out.println(String.valueOf(i) + ": Empty");
            }else {
                System.out.println(String.valueOf(i) + ": " + hastable[i].doggo);
            }
        }
    }


}
