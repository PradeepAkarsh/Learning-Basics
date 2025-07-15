package oopsConcept;
// YouTube Abstract Concept :-  https://www.youtube.com/watch?v=VJh2u7NLLDg
/*
* The main importance of Abstract class is to create a method for now and don't know what to implement in it.
* Later when you know what function should be in it, then you can define it. by creating Abstract child class.
* All selenium methods are Abstract class.
  Exp:-
  * driver.get
  * to find click and hold ctrl+left Click, then it will redirect you to another page were you can find Abstract class.

 


* Abstract class can have Non - Abstract method and Abstract method both.
* We cannot create the Object of Abstract class.
* If you want to create object of Abstract class then you need to have a child class for Abstract class (Using EXTENDS keyword)
* You can only Declare a method in the Abstract class, you cannot Define the method. ( you cannot write a function or code in it)
  Exp:->   public abstract MethodName();
* If you want to implement the method then you need to have a child class for Abstract class,
  where we can implement the Abstract class methods, if you don't implement the method then it will throw error.
* Implementing Abstract method in child class
  Exp:->
  Class childClassName extends ParentClassName
  {
    public void Abstract_MethodName_From_ParentClass ()
    {
      here you can write the logic;
    }
  }
* This child class is known as Concrete class, and parent class is known as Abstract class.
* you can create an Object of Concrete class not an Abstract class
* After creating both Abstract and concrete class you need to call it in Main method for execution,
  here is an EXAMPLE how you can Create an Abstract class reference and to call the methods from concrete class.
  Exp:->

  AbstractClass abstractClass = new ConcreteClass();
  abstractClass.Concrete_ClassMethods();
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Abstract_Class_1_Mobile {
    abstract void MessagingServices();
    public void torch(){
        System.out.println("Torch");
    }


}
