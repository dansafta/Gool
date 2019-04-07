

package org.fasttrackit.oop;

public class Cat extends Animal{
    public String favToy = "Samy";

    public void playWith() {
        System.out.println("Yeah " + favToy);
    }

    public void walkAround() {
        System.out.println(this.getName() + " stalks around and then purrs");
    }
    public String getToy() {
        return this.favToy;
    }
    public Cat(){

    }
    public Cat(String name, String favFood, String favToy){


    super(name, favFood);
    this.favToy = favToy;

    }



    }