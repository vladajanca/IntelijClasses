package com.syntax.class28;

import java.util.*;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String>courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("ManualTesting");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkings");
        courses.add("Inteview");
        courses.add("Resume");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        System.out.println(courses);
        courses.set(courses.size()-1,"Happy");//replace
        System.out.println(courses);

    }
}
