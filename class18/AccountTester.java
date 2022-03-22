package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {
        Account account= new Account();
        //account.printUserName(); private access, cant be accessed
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();

        //accesing a field directly is diferente than accessing the same field with methods
        //having different access modifier
        //System.out.println(account.userName);
        //System.out.println(account.password);
        //System.out.println(account.balance);
        System.out.println(account.accoutNumber);
    }
}
