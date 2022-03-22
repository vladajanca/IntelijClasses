package com.syntax.class25;

public class BankAcount {
   private double balance=1234;
   private String userName="Habbib";
   private String password="Habbib123";

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    void printBalance(String userName, String password){
        if(userName.equals(this.userName)&&password.equals(this.password)){
            System.out.println(balance);
        }else{
            System.out.println("Username or pasword is not correct");
        }
    }

}
class BankAccountTester{
    public static void main(String[] args) {
        BankAcount account=new BankAcount();
        account.printBalance("Habbib","Habbib123");
    }
}
