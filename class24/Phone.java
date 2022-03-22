package com.syntax.class24;

public abstract class Phone {
   void makePhoneCalls(){
       System.out.println("Making a phone calls");
    }
   void sendText(){
       System.out.println("Sending a text");
   }
   abstract void displayPicture();
   abstract void unlockPhone();
}
class Iphone extends Phone{
    void displayPicture(){
        System.out.println("Use the photo app to display the pictures");
    }
    void unlockPhone(){
        System.out.println("Can use face unlock and indysplay finger print to unlock phone");
    }

}
class Samsung extends Phone{
    void displayPicture(){
        System.out.println("Use gallery to display pics");
    }
    void unlockPhone(){
        System.out.println("Use face to unlock the phone");
    }
}
