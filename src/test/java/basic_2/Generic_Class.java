package basic_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

public class Generic_Class {
    public static String getValue(String key) {
        /*
        * here variable cannot be a local variable, if it is, then it should be in a try catch,
          then we cannot call it in return, so we create it outside the try catch as null value then use it
        * */

        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        String value = null;
        try {
        FileInputStream in = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(in);
        value = prop.getProperty(key);
        }catch (Exception e){

        }
        return value;
    }

    public static Character removeDuplicateChar(String name){
        Character chr = null; // created a null Character
        //Creating an Object of interface class by pointing to Child class
        List<Character> characterList = new ArrayList<>();
        //Creating a for loop, for every iterate we call List object, and we add one character of  String.
        for (int i = 0; i < name.length(); i++) {
            characterList.add(name.charAt(i)); // here we keep on adding string on every iterate.until it finishes.
        }
        //System.out.println(characterList);
        //Creating an object of HashSet and then calling list into HashSet.
        HashSet<Character> set = new HashSet<>(characterList);
        for (Character character:set) {
            System.out.print(character+ " ");
            chr = character; // the null Character which is created above is used here.
        }
        return chr; // the null Character which is created above is used here in return statement.
    }


}
