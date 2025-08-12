package basic_2;

import java.util.HashSet;
import java.util.Set;
/*
* Set will remove the duplicate values  but whereas List will not remove.
* List will print in an order wise, what all you entered value in order, the same order it will print values.
* In Set the order value is not guaranteed, it will be jumbled way.
*/
public class Day_17_Set_1 {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>(); // we cannot create a object of Interface, so we are creating child class Object here.
        HashSet<String> set = new HashSet<>(); // like this also we can create.
        set.add("Ronny");// Duplicate value
        set.add("Tommy");
        set.add("Ronny");
        set.add("Tiger");

        for(String setValue : set){
            System.out.println(setValue);
        }

    }
}
