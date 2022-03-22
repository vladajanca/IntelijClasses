package com.syntax.ReviewClass8;

public class StringClass3 {
    public static void main(String[] args) {
        String batch = "Batch 12";
        String course="SDET";

        String company="        Syntax      Tech";

        if(batch.equals("Batch 12")&&course.equals("SDET")){
            System.out.println("You will get the link to MS lecture");
        }else {
            System.out.println("Watch my youtube channel");
        }
        if("Batch 12".equalsIgnoreCase(batch)&&"SDET".equalsIgnoreCase(course)){
            System.out.println("Now all types of inputs are accepted");
        }
        System.out.println(company.trim());// trim method remove only spaces at the ends, but not in between

        String name = "Nasir   gopi krishna     ramakrishnah";
        System.out.println(name.replaceAll(" ",""));

    }
}
