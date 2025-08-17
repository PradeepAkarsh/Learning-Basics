package basic_2;

import net.bytebuddy.description.type.TypeList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
* In property file, values are stored in the form of Key and Value.
* EXP:-> abc =
* To read from the property file, first you need to locate the property file where it is in the project structure.
* Now to read the file create an object of FileInputStream and pass the path of file in FileInputStream.
* After adding FileInputStream class you need to add a method signature to handle exception.
* Now to read from properties file, create an Object of Properties class.
* Now use the properties class object reference name ( prop.load() ), and use (load) method to load a file.
* Here load method also throws exception to handle it use method signature.
* in ( prop.load(  ) ) load method, pass the FileInputStream Object reference name, to read the values.
* Now use getProperty method using  Properties class object reference.
* Exp(property.getProperty(" ")) in the getProperty method pass the KEY in string format that is using (" ")
  to get the value, which is from the Config.properties file.
* To get to know are we getting correct value store it in String and print it.
*
* Every time you cannot write this many lines of code to get the single value.
* So create a reusable method in Generic class.
* */


public class Day_14_Read_Property_File_Read {
    public static void main(String[] args) {
        /*String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        FileInputStream in = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(in);
        String value = prop.getProperty("url");
        System.out.println("value is :"+ value);*/
        String value = Generic_Class.getValue("url"), StrBrowser = Generic_Class.getValue("browser");

        WebDriver driver= null;
        
        if(StrBrowser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (StrBrowser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(value);
        driver.manage().window().maximize();

        System.out.println("This is the value : "+ value);
    }
}
