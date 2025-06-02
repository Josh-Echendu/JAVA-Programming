package OOP.Abstraction;

public class Abraction_Tutorial {

// You cannot create an object directly from an abstract class.
// However, you can access its properties or methods through a child class that extends it.

// When an abstract method is defined in an abstract class,
// any subclass (child class) that inherits from this abstract class 
// must provide an implementation for the abstract method.

    public static void main(String[] args){
        Chihuahua c = new Chihuahua();
        c.bark();
        c.dance();

    }
}
 