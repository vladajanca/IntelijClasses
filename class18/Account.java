package com.syntax.class18;

public class Account {

    private String userName="Teyfur";
    private String password="Admin";
    public  String accoutNumber="123456";
    private double balance=1500;

    private void printUserName(){
        System.out.println(userName);
    }
    protected void printPassword(){
        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public void printAccountNumber(){
        System.out.println(accoutNumber);
    }

    public static void main(String[] args) {
        Account account= new Account();
        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

        System.out.println(account.userName);
        System.out.println(account.password);
        System.out.println(account.balance);
        System.out.println(account.accoutNumber);
    }
}
