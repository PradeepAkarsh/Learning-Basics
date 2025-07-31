package basics;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Day_13th_DataGeneration_Example_2 {

    public static String DataGenFirstName(){
        Faker faker= new Faker(new Locale("en-IND"));
        String fname = faker.name().firstName();
        return fname;
    }
    public static String DataGenLastName(){
        Faker faker= new Faker(new Locale("en-IND"));
        return faker.name().lastName();
    }
}
