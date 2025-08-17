package basic_2;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* List inside a HashMap.
*
*/
public class Day_18_Map_2 {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Abhi");
        listA.add("Bahu");
        listA.add("Cathy");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("Dany");
        listB.add("Envi");
        listB.add("Ferrari");

        HashMap<String, List<String>> map = new HashMap<>();
        map.put("listA : ",listA);
        map.put("listB : ",listB);

        //System.out.println(map.entrySet()); //
        for (Map.Entry<String,List<String>> ref : map.entrySet()) {
            //System.out.println(ref.getKey()); // Different line output bcz it's a HashMap Class
            //System.out.println(ref.getValue());// Different line output bcz it's a HashMap Class
            //If you want ot call in a single line the just call HashMap reference.
            System.out.println(ref);
        }
    }
}
