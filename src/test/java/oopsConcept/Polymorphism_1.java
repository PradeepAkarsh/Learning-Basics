package oopsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
* Here WebDriver is an Interface, and We Cannot create Object of the Interface
* WebDriver driver = new ChromeDriver();
* Here WebDrive pointing to its Child Class, that is ChromeDriver, this process is known as POLYMORPHISM;
*
* */
public class Polymorphism_1 {
    public void run(){
        WebDriver driver = new ChromeDriver();
    }
}
