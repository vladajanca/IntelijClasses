package com.syntax.class26;

public class ShoppingCart {
    private double OriginalPrice=100;
    private double discount=.15;
    void setDiscount(double discount){
        if(discount>0&&discount<.15){
            this.discount=discount;
        }else {
            System.out.println("Cant have that much discount");
        }
    }
    public double getDiscount(){
        return discount;
    }
    void calculatePrice(){
        double price= OriginalPrice-(OriginalPrice*.15);
        System.out.println(price);
    }
}