package org.fasttrackit.restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu {

    //fields
    private ArrayList<Item> appetizers = new ArrayList<Item>();
    private ArrayList<Item> cakes = new ArrayList<Item>();
    private ArrayList<Item> main = new ArrayList<Item>();
    private ArrayList<Item> drinks = new ArrayList<Item>();



    //constructors

public Menu(){

    populateMenu();
}

    //assessors and mutators

    //return a specific appetizer
    public Item getAppetizer(int index){
    return appetizers.get(index);
    }
// returns the size of the category
    public int getAppetizersSize(){
    return appetizers.size();

    }
    //return a specific appetizer
    public Item getCake(int index){
        return cakes.get(index);
    }
    // returns the size of the category
    public int getCakesSize(){
        return cakes.size();

    }




    //return a specific appetizer
    public Item getMain(int index){
        return main.get(index);
    }
    // returns the size of the category
    public int getMainSize(){
        return main.size();

    }



    //return a specific appetizer
    public Item getDrinks(int index){
        return drinks.get(index);
    }
    // returns the size of the category
    public int getDrinksSize(){
        return drinks.size();

    }






    public ArrayList<Item> getCakes() {
        return cakes;
    }

    public void setCakes(ArrayList<Item> cakes) {
        this.cakes = cakes;
    }

    public ArrayList<Item> getMain() {
        return main;
    }

    public void setMain(ArrayList<Item> main) {
        this.main = main;
    }

    public ArrayList<Item> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Item> drinks) {
        this.drinks = drinks;
    }

    //returns all appetizers as a string
    public String getAllAppetizers() {
        String aMenu = "";
        aMenu += "APPETIZERS:\n";
        for (int i = 0; i < appetizers.size(); i++) {
            Item a = appetizers.get( i );
            //ad id, name, and price
            aMenu += "A" + (i+1) + " " + a.toString() + "\n";

        }
        return aMenu;

   }




    //returns all cakes as a string
    public String getAllCakes() {
        String aMenu = "";
        aMenu += "CAKES:\n";
        for (int i = 0; i < cakes.size(); i++) {
            Item a = cakes.get( i );
            //ad id, name, and price
            aMenu += "A" + (i+1) + " " + a.toString() + "\n";

        }
        return aMenu;

    }





    //returns all mains as a string
    public String getAllMain() {
        String aMenu = "";
        aMenu += "MAINS:\n";
        for (int i = 0; i < main.size(); i++) {
            Item a = main.get( i );
            //ad id, name, and price
            aMenu += "A" + (i+1) + " " + a.toString() + "\n";

        }
        return aMenu;

    }



    //returns all drinks as a string
    public String getAllDrinks() {
        String aMenu = "";
        aMenu += "DRINKS:\n";
        for (int i = 0; i < drinks.size(); i++) {
            Item a = drinks.get( i );
            //ad id, name, and price
            aMenu += "A" + (i+1) + " " + a.toString() + "\n";

        }
        return aMenu;

    }

   // methods

    public void populateMenu(){

        //appetizers
        appetizers.add(new Item("Quiche Lorraine", "Appetizers", 6));
        appetizers.add(new Item("Salmon Quiche\t ", "Appetizers", 7));
        appetizers.add(new Item("Warm Salad\t", "Appetizers", 5));


        // cakes

        cakes.add(new Item("Cheesecake\t", "cakes", 4));
        cakes.add(new Item("Pavlova\t\t\t", "cakes", 4));

        //main dishes


         main.add(new Item("Beef Bourguignon", "mashed potatoes", 10));
         main.add(new Item("Coq Au Vin\t", "mashed potatoes", 10));

        //drinks

        drinks.add(new Item("Water\t\t", "drinks", 2));
        drinks.add(new Item("Ursus", "drinks", 5, "500 ml"));
    }

    //toString

    //prints out full menu in one String

    public String  toString(){
    String menu = "";
    menu += " Bufood MENU\n" +

"-----------------------------------------------------------------------\n";

menu += getAllAppetizers() + "\n";
menu += getAllCakes() + "\n";
menu += getAllMain() + "\n";
menu += getAllDrinks() + "\n";
return menu;
    }

}



