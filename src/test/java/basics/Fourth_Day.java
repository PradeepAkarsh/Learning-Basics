package basics;

public class Fourth_Day {
    String name = "Tommy is my dog pet name .";

    public static void main(String[] args) {
        Fourth_Day fd = new Fourth_Day();
       fd.stringExamples();
       fd.splitExample();
       System.out.println("***************");
       fd.forLoop_Example();
       fd.forEachLoop_Example();
       fd.stringBoolean();
       fd.trim_Example();
    }

    public void stringExamples() {

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("t", "$"));
        System.out.println(name.toLowerCase().replace("t", "$"));
        System.out.println(name.substring(3));
        System.out.println(name.substring(1, 5));
    }

    public void splitExample() {
        /*in this  you need to give single character to split and that happens between given single
        character to character ex: * what is your date of birth * here you can find first R in (YOUR) word and
        second R in (BIRTH) word. and in Array block you need to provide index of word. here you have 6 words
        and index starts from 0, that means here we have 0-5 words
        (" single character") to [Number]
        */

        System.out.println(name.split("m")[2]);
    }
    public void forLoop_Example(){
        /*
                for loop
          for(Declaration/ Initialization ;condition; Increment /Decrement )

         */
        for(int i=0; i<6;i++){
            System.out.println(name.split(" ")[i]);
        }
    }

    public void forEachLoop_Example(){
        /*
                for Each loop
          for(DataType referenceVariable: Name of The Array)

         */
        for(String n: name.split(" ")){
            System.out.println(n);
        }
    }

    public void stringBoolean (){

        String name = "Tommy";
        System.out.println(name.equals("tommy"));
        System.out.println(name=="tommy");
        System.out.println(name.equalsIgnoreCase("tommy"));
        System.out.println(name.startsWith("T"));
        System.out.println(name.contains("o"));
        System.out.println(name.endsWith("y"));
    }

    public void trim_Example (){

        String a = " Tommy is my favorite dog ";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.trim().length());
        System.out.println(a.trim().replace(" ", "_"));
        System.out.println(a.trim());
        System.out.println(a.replace(" ",""));
    }
}

