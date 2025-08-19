package basic_3_TestNG;

import org.testng.annotations.*;

import java.awt.desktop.SystemSleepEvent;

public class Day_19__TestNG_Annotations {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suit");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("Before Suit");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("After Test");
    }
    @Test
    public void test(){
        System.out.println("Test");
    }
}