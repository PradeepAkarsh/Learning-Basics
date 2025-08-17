package basic_2;

import java.util.Arrays;

/*
Another type of Array method.
Here we can set the limit of index.
We can sort the Integer numbers using Arrays class not Array class.
We can sort the Names using Arrays class not Array class.
*/
public class Day_15_Array_Example2 {
    public static void main(String[] args) {
      String [] names = new String[2]; // this is how we set the limit of index. We have set 2 limits, that means 0 & 1
        names[0]="Andy";
        names[1]="Randy";
        //names[2]="Mandy";  // If we add 3rd value then it wll throw exception (ArrayIndexOutOfBoundsException).

        for (String values : names) {
            System.out.println(values);
        }

        System.out.println("  ");
        System.out.println("Sorting numbers using Arrays Class :-");
        Integer[] numbers = {123,1234,789,456,519,3857};

        Arrays.sort(numbers);
        for (int num:numbers) {
            System.out.println(num);
        }

    }
}
