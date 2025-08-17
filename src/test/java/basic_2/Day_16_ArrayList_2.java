package basic_2;

import java.util.ArrayList;
import java.util.Collections;

/*
Sort the list Using Collections class
*/
public class Day_16_ArrayList_2 {
    public static void main(String[] args) {
        /*We cannot create an Object of Interface class or Abstract class */
        //List<String> list = new ArrayList<String>(); // This first way where Parent class pointing to child class.
        // Here we are creating Object of child Class itself.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Cow");


        System.out.println(animals);
        //Now we are adding Upside ArrayList in below ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Daisy");
        names.add("Kia");
        names.add("Kitty");
        names.addAll(animals); // This method addAll() is used to merge another List into this  List.

        Collections.sort(names); // In ArrayList we use Collection.sort()  to sort the names.

        // Tow methods to print the values using loop For loop and For Each loop;
        System.out.println("Sorting names using for loop:-");
        for (int i=0; i<names.size();i++){
            System.out.println(names.get(i));
        }

        System.out.println("Sorting names using for Each loop:-");
        for (String lis:names) {
            System.out.println(lis);
        }

    }
}
