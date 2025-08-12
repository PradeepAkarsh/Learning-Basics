package basic_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ListIterator;

/*
TypeCasting ArrayList to HashSet
*/
public class Day_17_ArrayList_To_Set {
    public static void main(String[] args) {
        /*We cannot create an Object of Interface class or Abstract class */
        //List<String> list = new ArrayList<String>(); // This first way where Parent class pointing to child class.
        // Here we are creating Object of child Class itself.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Cow");

        HashSet<String> set = new HashSet<>(animals); // Type Casting Array list to HashSet.

        System.out.println(set);
        for (String a:set) {
            System.out.println(a);
        }
    }
}
