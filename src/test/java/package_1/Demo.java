package package_1;

import basic_2.Generic_Class;
import basics.Day_8th_Class_Static_Return;

import java.lang.reflect.Array;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

      /*  String name = "pradeep";
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            characterList.add(name.charAt(i));
        }
        System.out.println(characterList);
        HashSet<Character> set = new HashSet<>(characterList);
        for (Character character:set) {
            System.out.print(character+ " ");

        }*/
       // Generic_Class.removeDuplicateChar("nandini");

        String string = "AAbbCDEEFfGGhIIIjk";
        String name = string.toLowerCase();
        List<Character> chars = new ArrayList<>();
        for (int i=0;i<name.length();i++){
            chars.add(name.charAt(i));
        }
        HashSet<Character> set = new HashSet<>(chars);
        for(Character c:set){
            System.out.print(c+" ");
        }


    }
}
