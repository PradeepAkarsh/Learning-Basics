package basic_3_TestNG;

import org.testng.annotations.Test;

public class Day_19_FaceBook extends BaseTest {

    @Test
    public void test001(){
        driver.get("https://www.Facebook.com");
    }
}