package basic_3_TestNG;

import org.testng.annotations.Test;

public class Day_19_Google extends BaseTest {

    @Test
    public void test001(){
        driver.get("https://www.google.com");
    }
}