package basic_2;

import java.io.File;
import java.io.IOException;

/*
* To create Configuration file programmatically, first you need to know you current project path in the system.

* use code  ( System.getProperty("user.dir") ).this will give you current path, if you want o check store it in
  String and print it.

* After giving the System.getProperty("user.dir") use + operator to add more, then add (File.separator)
  here .separator is used for to handle the backslash or forward slash, because in Windows Backslash works
  and in Mac Operating it uses Forward slash.
  following with add ( + "Name.txt or .properties, or you can create any format file")

* Import the File Class by hovering on the File word, the class should get import from java.io.File.
* now its a ready to create a file, but to add it in project structure you need to do following things.
* That file path which you have given, store it in a String, and pass that String reference in to the File.
  File file = new File(path);
* Then use method createNewFile();. this will create a that file in the project structure.
* after adding createNewFile() method you need to add a method signature to handle the exception.

* */


public class Day_14_Read_Property_File {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"dummy.properties";
        System.out.println(path);
        File file= new File(path);
        file.createNewFile();
    }
}
