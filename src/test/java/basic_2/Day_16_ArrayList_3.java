package basic_2;

import java.util.ArrayList;
import java.util.Iterator;

/*
//This is also a way to print ArrayList
*/
public class Day_16_ArrayList_3 {
    public static void main(String[] args) {
        /*We cannot create an Object of Interface class or Abstract class */
        //List<String> list = new ArrayList<String>(); // This first way where Parent class pointing to child class.
        // Here we are creating Object of child Class itself.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Lion");
        animals.add("Cow");



        //Now we are adding Upside ArrayList in below ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Daisy");
        names.add("Kia");
        names.add("Kitty");
        names.addAll(animals); // This method addAll() is used to merge another List into this  List.

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next()); // next() is used to print the values
        }
        // We can also use forEach()  to print all values
        System.out.println("      ForEach loop :-   ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
