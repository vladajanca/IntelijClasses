package com.syntax.GroupTasksJava;
//Create Registration Class in which you would have variables as email, userName and password that
//have an access scope only within its own class. After creating an object of the class user should be able to
//call methods and in each method separately pass values to set users email, username and password.
//Requirements:
//A.Valid email consider to be only yahoo
//B.Valid userName and password cannot be empty and
//should be of length larger than 6 characters. Also valid password cannot contain userName.
public class Task4 {
    public static void main(String[] args) {
        Registration obj=new Registration("vlad123@gmiaml.com","vladajanca","vlad123");
        obj.Email();
        obj.Username();
        obj.Password();
    }
}
class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    void Email() {
        if (email.contains("yahoo")) {
            System.out.println("Correct Email Type");

        } else {
            System.out.println("Incorrect Email Type");
        }
    }

    void Username() {
        if (!userName.isEmpty()) {
            System.out.println("Username not Empty");
        } else {
            System.out.println("Username Empty");
        }
        if (userName.length() > 6) {
            System.out.println("Username is Larger than 6 characters");
        } else {
            System.out.println("Username is less than 6 characters");
        }
    }
    void Password(){
        if(!password.isEmpty()){
            System.out.println("Password not empty");
        }else{
            System.out.println("Password empty");
        }
        if(password.length()>6){
            System.out.println("password is greater than 6 characters");
        }else {
            System.out.println("password is less than 6 characters");
        }
    }

}