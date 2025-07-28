package Day_10th_OOpsConcept;
/*
Interface : while creating a java file choose Interface instead of class;
it is pure abstract class, so you cannot create a method with body.
You can create a method without body and access this class in using ( IMPLEMENTS )key word, not an EXTENDS keyword,
and there you crate this interface class method, and we can have method body in that child class.
In this Interface we cannot create a non-abstract class.
You can call this interface, in the Class using Implements keyword.
In class, we can inheritate only single class, but interface we can inherit multiple interface class using implements
Ex: public class A implements B,C
    {

    }
If you don't mention access modifier to the method then default it will be PUBLIC access modifier,
but whereas in class if you don't mention it will be DEFAULT access modifier.

*/
public interface Interface_Example_2_Destination {

    void cities(String city);

}
