package basic_2;

import java.util.HashMap;
import java.util.Map;

public class Day_18_Map_1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // In the Map class we store values in the form of Key and Value.

        map.put("Name","Avinash"); // This is how Key and Value is stored.
        map.put("Number","9879879875");

       // System.out.println(map.get("Name"));// This is how you get single value using Key

        /*
        Entry<> method :-
        Here's what Map.Entry does:
        Encapsulates Key and Value:
        It bundles a key and its corresponding value into a single object, allowing them to be treated as a unit.
        */

        /*
        Provides a View of Key-Value Pairs:
        Instead of getting separate collections for keys (using keySet()) or values (using values()),
        entrySet() gives you a direct way to access both the key and
        its corresponding value together as a single Map.Entry object.
        */
        for (Map.Entry<String,String> ref : map.entrySet()){ // this entrySet() method is used to get value with pair.
            System.out.println(ref); // All Keys with Values are called using simple Map object reference name

            //System.out.println("getKey is called :  "+ref.getKey()); // All key is called using getKey method
            //System.out.println("getValue is called :  "+ref.getValue());// All Values are called using getValue method
        }
    }
}
