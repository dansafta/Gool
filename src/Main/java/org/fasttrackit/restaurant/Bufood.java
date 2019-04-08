package org.fasttrackit.restaurant;

public class Bufood {

    public static void main(String[] args) {
        Menu menu = new Menu();

      //gets the number of appetizers in our menu
        int s = menu.getAppetizersSize();
        System.out.println("Appetizers: " + s );

        //prints a list of the appetizers
        System.out.println(menu.getAllAppetizers());

        //prints a particular appetizer in the menu
        Item myItem = menu.getAppetizer(1);
        System.out.println(myItem);


//gets the number of cakes in our menu
        int c = menu.getCakesSize();
        System.out.println("Cakes: " + c );

        //prints a list of the cakes
        System.out.println(menu.getAllCakes());

        //prints a particular appetizer in the menu
        Item myItems = menu.getCake(1);
        System.out.println(myItems);




        //gets the number of mains in our menu
        int l = menu.getMainSize();
        System.out.println("Main: " + l );

        //prints a list of the mains
        System.out.println(menu.getAllMain());

        //prints a particular main in the menu
        Item myItemz = menu.getMain(1);
        System.out.println(myItemz);



        //gets the number of drinks in our menu
        int p = menu.getDrinksSize();
        System.out.println("Drinks: " + l );

        //prints a list of the drinks
        System.out.println(menu.getAllDrinks());

        //prints a particular drink in the menu
        Item myItemss = menu.getMain(1);
        System.out.println(myItemss);
//prints entire menu
        System.out.println(menu.toString());
    }
}
