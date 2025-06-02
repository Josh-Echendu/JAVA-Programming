package OOP.Polymorphism;

public class Polymorphism {
    public static void main(String[] args){

        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog dog = new Dog();

        //method overiding
        dog.eat();

        //method overiding
        Cat mycat = new Cat();
        mycat.eat();
        
        //method overloading
        dog.eat(5);



    }
}
