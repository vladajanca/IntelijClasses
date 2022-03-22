package com.syntax.class21;

public class User {
    /*
    Write program: userClass  that has a constructor that initializes instance variable
    name and mobile number. Create a subclass  userInfo that will have
    user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobNumber;

    public User( String name, int mobNumber) {
        this.name = name;
        this.mobNumber = mobNumber;
    }
}
class userInfo extends User{
    String userAdress;

    public userInfo(String name, int mobNumber, String userAdress) {
        super(name,mobNumber);
        this.userAdress = userAdress;
    }
    void userDetals(){
        System.out.println(name+" "+mobNumber+" "+userAdress);
    }
}
class TestUser{
    public static void main(String[] args) {
        userInfo userinfo=new userInfo("Francic", 123123321,"123 werty");
        userinfo.userDetals();
    }
}
