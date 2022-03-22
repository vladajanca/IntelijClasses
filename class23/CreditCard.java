package com.syntax.class23;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {
    double balance;
    double interes;

    public CreditCard(double balance,double interes) {
        this.balance = balance;
        this.interes = interes;
    }

    void calculate(){
        System.out.println(balance*interes);
    }
}
class Visa extends CreditCard{

    public Visa(double balance, double interes) {
        super(balance, interes);
    }

    @Override
    void calculate(){
        System.out.println(balance*interes+1);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interes) {
        super(balance, interes);
    }

    @Override
    void calculate(){
    System.out.println(balance*interes+2);
}

}
class CreditCardTester{
    public static void main(String[] args) {


        CreditCard creditCard = new CreditCard(100, .15);
        creditCard.calculate();
        AX ax=new AX(100,.15);
        ax.calculate();
        Visa visa=new Visa(100,.15);
        visa.calculate();
    }
}
