package com.syntax.class17;

import com.syntax.class18.AccessModifiers;

public class AccessModifiersTester {
    AccessModifiers am= new AccessModifiers();
        //cant access name because it has private access
        //System.out.println(am.name);
        //System.out.println(am.age);
        //cant access age becaouse it has default access
       // System.out.print(am.color);
        //System.out.println(am.weight);
        //canr access color because it has public access
}
