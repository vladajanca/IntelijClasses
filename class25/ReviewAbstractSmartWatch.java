package com.syntax.class25;

public abstract class ReviewAbstractSmartWatch {
    private int Ram;
    private int Rom;
    double dysplaySize;
    public String make;
    static boolean showTime=true;

    public ReviewAbstractSmartWatch(int ram, int rom, double dysplaySize, String make) {
        //alt+insert to generate constructor
        this.Ram = ram;
        this.Rom = rom;
        this.dysplaySize = dysplaySize;
        this.make = make;
    }
    //1.we specify access modifiers
    //2. we specify non access modifiers
    //3. we specify return type
    //4.we specify method name
    public abstract void showHealthTips();
    private void updateOS(){
        System.out.println("Updating the OS");
    }
    private void checkupdateOS(){
        System.out.println("Checking if update is available");
    }
    private void downloadupdate(){
        System.out.println("Downloading the update");
    }
    private void instalingupdate(){
        System.out.println("Instaling the update");
    }
    static void dysplayTime(){
        System.out.println("Dysplaying time");
    }

}
class AppleWatch extends ReviewAbstractSmartWatch{

    public AppleWatch(int ram, int rom, double dysplaySize, String make) {
        super(ram, rom, dysplaySize, make);
    }

    @Override
    public void showHealthTips() {
        System.out.println("Use the health app ");
    }
}
class WatchTester{
    public static void main(String[] args) {
        AppleWatch appleWatch=new AppleWatch(2,16,1.5,"Apple");
        appleWatch.showHealthTips();
        appleWatch.dysplayTime();
    }
}

