package oopsConcept;

/*
Single Level Inheritance Example.
Accessing only Animal class Properties.
 */


//Child Class OR Sub-Class ---> Super Class OR Parent Class
public class Inheritance_2_Dog extends Inheritance_1_Animal{

    public void bark(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Inheritance_2_Dog dog = new Inheritance_2_Dog();
        dog.bark();

        //Single level Inheritance (Accessing Animal Class properties)
        dog.fur();
        dog.tail();

        //Multi Level Inheritance (Accessing --> Animal Class --> veterinary Class Properties)
        dog.vaccination();
    }
}
