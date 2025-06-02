package OOP.Interface;

interface Greater{
    String color = "Blue";
    void greet();
}

class Person implements Greater {

    private String name;

    //constructor to pass data
    public Person(String name){
        this.name = name;
    }

    @Override
    public void greet() {
        // we printed color cos, it is inheriting the interface
        System.out.println(color);
        System.out.println(Greater.color);
        System.out.println("Hello, my name is " + this.name);
    }
}

public class Main {
    public static void main(String[] args){
        Person person = new Person("adaora");
        person.greet();
    }
    
}
