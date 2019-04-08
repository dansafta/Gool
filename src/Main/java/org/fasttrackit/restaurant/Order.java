package org.fasttrackit.restaurant;
import java.util.Random;
import java.util.ArrayList;

public class Order {


    //fields
    private static int orderNo = 0;
private ArrayList<Item> order = new ArrayList<Item>();




    //constructors

public Order(){}


    //assesors, mutators
//get item from order
    public Item getItem(int index){
    return order.get(index);
    }
/* additem to order */

public void addItem(Item item){

    order.add(item);
}




    //methods

    //remove an item from order
    public void removeItem(Item item){
    order.remove(item);
    }
// get order size

    public int getSize(){
    return order.size();
    }
//clears the order

public void clearOrder(){
    order.clear();
}

// get order nr

    public int getNumber() {
        return orderNo;

    }
    //increment order no

    public void incrementNo() {

    orderNo++;
    }

    // gets a random servier for the order

    public String getServer() {
        Random rand = new Random();
        int num = rand.nextInt( 10 ) + 1;

        switch (num) {
            case 1:
                return "Loly";

            case 2:
                return "John";

            case 3:
                return "Ally";


            default:
                return "no server available";

        }//end of swithc
    }

    // to String
    public String toString(){
    String str = "";
for(int i = 0; i < order.size(); i++ ){
    str += order.get(i).toString() + "\n\n";

}// end of loop
return str;
    }
}
