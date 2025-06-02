package OOP.Polymorphism;

public class Dog extends Animal{
    
    //method overiding
    public void eat(){
        System.out.println("Chomp Chomp....");
    }

    //method overloading
    public void eat(int numberoftimes){
        for(int i = 0; i<numberoftimes; i++){
            System.out.println("chomp Chomp");
        }
    }
}
