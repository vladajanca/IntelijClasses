package com.syntax.class18;

public class Facebook {
    private String userName;
    private String password;
    private int age;
    void setAge(int personAge){
        if(personAge>13&&personAge<80){
            age=personAge;
        }else{
            System.out.println("not allowed its not a horse");
        }
    }
    public static void main(String[] args) {

    }
    int getAge(String userPassword){
        if(userPassword.equals(password)){
            return age;
        }else{
            return -1;
        }
    }
}
