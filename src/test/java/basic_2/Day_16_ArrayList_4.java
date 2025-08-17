package basic_2;

import java.util.ArrayList;
import java.util.ListIterator;

/*
//This is also a way to print ArrayList
*/
public class Day_16_ArrayList_4 {
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


        ListIterator<String> it = names.listIterator(); // Using ListIterator we can travers execution in different ways.

        while (it.hasNext()){
            System.out.println(it.next()); // next() method is used to print the values
        }

        //Now we see how to print in a reverse order
        System.out.println("***********************************");
        while (it.hasPrevious()){ // hasPrevious() method to be used to go previous
            System.out.println(it.previous()); // previous() method is used to print the values in reverse order
        }
    }
}
