package oopsConcept;

/*
* Accessing the Private Variables outside the class is called Encapsulation.
* These can be achieved by using Getters and Setters.
*
* */
public class Encapsulation_1 {
    private int number;

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    /*
     When you call THIS keyword, then it takes that Variable
     and assign the VALUE which is in front of that
     EXP:->
     String dog = "Ronny";

     this.dog = "Tommy";

     System.out.println(dog)
     Output : Tommy
    */
    /*String dog = "Ronny";
    public void dogg(){
        dog = "Tommy";
        System.out.println("Method Call : "+dog);
    }*/
    public static void main(String[] args) {
        Encapsulation_1 ec = new Encapsulation_1();
        ec.setNumber(3456);
        System.out.println(ec.getNumber());

        /*System.out.println("*****");
        System.out.println("Variable : "+ec.dog);
        System.out.println("*****");
        ec.dogg();*/
    }

}

