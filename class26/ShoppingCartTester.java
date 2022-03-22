package com.syntax.class26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingcart=new ShoppingCart();
        //shoppingcart.OriginalPrice=100;
        shoppingcart.setDiscount(.10);
        shoppingcart.calculatePrice();
    }
}
