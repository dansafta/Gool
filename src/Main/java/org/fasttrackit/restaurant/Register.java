package org.fasttrackit.restaurant;

import java.text.NumberFormat;

public class Register {


    //fields
private static final double TAX = 0.05; //salex tax
private double subtotal;
private double total;
private NumberFormat numForm = NumberFormat.getCurrencyInstance();
Order order = new Order();



    //constructors
public Register(Order order){

    this.order = order;
    order.incrementNo();

}


    // accessors

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    //methods


public double calcSubtotal(){
    for (int i = 0; i < order.getSize(); i++){
        Item item= order.getItem(i);
        subtotal += item.getPrice();
    }
    return subtotal;
}


   //toString

}
