package basic_3_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
