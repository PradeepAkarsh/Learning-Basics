package basic_2;

import java.util.*;

/*

*/
public class Day_16_ArrayList {
    public static void main(String[] args) {
        /*We cannot create an Object of Interface class or Abstract class */
        //List<String> list = new ArrayList<String>(); // This first way where Parent class pointing to child class.
        // Here we are creating Object of child Class itself.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");


        System.out.println(animals);
        //Now we are adding Upside ArrayList in below ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Daisy");
        names.add("Kia");
        names.add("Kitty");
        names.addAll(animals); // This method addAll() is used to merge another List into this  List.

        System.out.println(names);
        System.out.println(names.size()); // This method is used to print index Size.



    }
}
