package basics;

import jdk.jshell.DeclarationSnippet;

/**
 @author pradeep
 @version 17
 */
public class First_Day {

    public void outPut(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        First_Day fd = new First_Day();
        System.out.println("*****Now Output Class *****");
        fd.outPut();
        System.out.println("*****Now dataTypes Class *****");
        fd.dataTypes();
        System.out.println("*****Now Operators Class *****");
        fd.operators();
    }
    public void dataTypes(){
        int age; // Declaration
        age = 0; // Initialization

        int a = 1234567899;
        long b = 123456789102345235l;
        short c = 1234;
        float d = 20.435f;
        double e = 23478.3245843;
        char f = 'c';
        boolean g = true;
        System.out.println("int : " + a);
        System.out.println("long : " + b);
        System.out.println("short : " + c);
        System.out.println("float : " + d);
        System.out.println("double : " + e);
        System.out.println("char : " + f);
        System.out.println("boolean : " + g);
    }
    public void operators(){
        int x = 10;
        int y = 20;
        int sum = x+y;
        System.out.println("sum = "+sum);
        x++;
        y--;
        System.out.println("X value is increased by + 1 = "+x);
        System.out.println("y value is Decreased by - 1 = "+y);

    }
}
