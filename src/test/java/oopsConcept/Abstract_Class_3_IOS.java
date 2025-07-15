package oopsConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstract_Class_3_IOS extends Abstract_Class_1_Mobile {
    void MessagingServices() {
        System.out.println(" IOS Messaging ");
    }

    public static void main(String[] args) {
        Abstract_Class_3_IOS ad = new Abstract_Class_3_IOS();
        ad.MessagingServices();

    }
}
