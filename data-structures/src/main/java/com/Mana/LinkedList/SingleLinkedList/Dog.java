package com.Mana.LinkedList.SingleLinkedList;

public class Dog {
    private String name;
    private String breed;
    private int  id;

    public Dog(String name, String breed, int id) {
        this.name = name;
        this.breed = breed;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", id=" + id +
                '}';
    }
}
