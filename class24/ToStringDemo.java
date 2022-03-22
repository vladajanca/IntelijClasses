package com.syntax.class24;

public class ToStringDemo {
        String name;
        int age;
        ToStringDemo(String name,int age){
            this.name=name;
            this.age=age;
        }
        public String toString(){
            return "MR A please show your face";
        }

    public static void main(String[] args) {
        ToStringDemo tostringdemo=new ToStringDemo("Mr A", 10);
        System.out.println(tostringdemo.toString());
    }
}
