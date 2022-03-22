package com.syntax.class25;
//Create a WebDriver Interface that will have the following unimplemented behaviour:
//openBrowser(), closeBrowser(), maximizeWindow(), findElement().
//Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
public class Task1 {

}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("find element Chrome");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open fairfox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close fairfox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize farifox");
    }

    @Override
    public void findElement() {
        System.out.println("Find element fairfox");
    }
}
class WebDriverTester {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.openBrowser();
        driver.maximizeWindow();
        driver.findElement();
        driver.closeBrowser();

        System.out.println("-----------");

        WebDriver driver2 = new FirefoxDriver();
        driver2.openBrowser();
        driver2.maximizeWindow();
        driver2.findElement();
        driver2.closeBrowser();
    }
}