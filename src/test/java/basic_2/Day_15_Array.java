package basic_2;

/*
Array stores the value in the form of index
And Index always starts from Zero.
In Array String we can store String and in Integer int we can store only int.
If you want to store both Int and String then use Object Array then we can store both data types.
*/
public class Day_15_Array {
    public static void main(String[] args) {
        String[] names = {"hello","hi","who","how"}; //This is how we store values in arrays, this is for String Array.
        System.out.println(names[0]); // This is how you can call particular data from Array in output.
        System.out.println(names[2]);

        //If you want to call all the data from arrays in output then you need to use loop.
        //use For loop OR For Each loop.
        System.out.println("  ");
     //For loop :-
        System.out.println("This is for loop :- ");
     for (int i=0;i< names.length;i++){  // Here we Initialization (I)th value a Zero in starting.
         System.out.println(names[i]);  // Here we call Array variable reference name with (I)th position.
                                        // This loops goes on until there is no more (I)th value to print.
     }

     System.out.println("  ");

     //For Each loop :-
        System.out.println("This is for Each loop :- ");
        for(String values : names){
            System.out.println(values);
        }

        Object values[] = {"Mahesh",3,"Himesh",2,"Suresh",1};
        System.out.println("This is the Object Array : "+values[1]);
        System.out.println("This is the Object Array : "+values[2]);

        System.out.println("This are all the Object Array values :");
        for (Object val:values) {
            System.out.println(val);
        }
    }
}
