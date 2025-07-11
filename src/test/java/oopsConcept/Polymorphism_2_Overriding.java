package oopsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * Here we are Creating a Parent class Object that is  ( RBI ) Class object
 * Using that RBI class reference, we are pointing to child class.
 * using that reference we are calling child class method.
 * THIS IS HOW POLYMORPHISM OVER-RIDE HAPPENS same Name and Parameter in different class.
 */
public class Polymorphism_2_Overriding {
    public static void main(String[] args) {
        Polymorphism_Overriding_1_RBI rbi;
        rbi = new Polymorphism_Overriding_1_SBI();
        System.out.println("SBI : "+rbi.getInterest());
        rbi = new Polymorphism_Overriding_1_ICICI();
        System.out.println("ICICI : "+rbi.getInterest());
    }
}
