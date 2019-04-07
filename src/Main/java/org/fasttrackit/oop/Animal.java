package org.fasttrackit.oop;

public class Animal {
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName) {

        this.name = newName;
    }

    protected final String getName() {

        return this.name;
    }

    public void eatStuff() {

        System.out.println("Good" + favFood);
    }

    public void walkArround() {

        System.out.println(this.name + "walkArround");
    }

    public Animal() {


    }

    public Animal(String name, String favFood) {

        this.changeName(name);
        this.favFood = favFood;
    }


    public void walkAround() {
    }
}



