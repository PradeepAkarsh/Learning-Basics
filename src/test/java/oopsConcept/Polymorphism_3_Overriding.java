package oopsConcept;


/*
 * Here we are Creating two Methods with same Name with different Parameter
 * If we call method name without parameter then First method is called.
 * If we call method name with parameter then Second method is called.
 * THIS IS HOW POLYMORPHISM OVER-LOAD HAPPENS same Name and with different Parameter in Same class.
 */
public class Polymorphism_3_Overriding {
   public void getInt(){
     System.out.println("This is getInt method without Parameter");
   }
    public void getInt(int x){
        System.out.println("This is getInt method with Parameter : " +x);
    }

    public static void main(String[] args) {
        Polymorphism_3_Overriding p3 = new Polymorphism_3_Overriding();
        p3.getInt();
        p3.getInt(25);
    }
}
