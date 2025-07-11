package oopsConcept;

public class Inheritance_Cat extends Inheritance_1_Animal {
    public static void main(String[] args) {
        Inheritance_Cat cat = new Inheritance_Cat();
        cat.fur();
        cat.tail();
        cat.vaccination();
        // Hierarchical Level Inheritance ( Accessing --> Animal Class AND Veterinary Class.)
        //How it is Hierarchical means ( Cat it is accessing ANIMAL Class AND Dog is also Accessing ANIMAL Class)
        //Cat and Dog classes are not interconnected but Both classes accessing the Animal Class.

    }
}

/*
                Veterinary
                     /\
                    / \                     |
                     |
                     |
                  Animal
                    /\
                   /  \
                  /    \
                 /      \
              DOG      Cat

*/
