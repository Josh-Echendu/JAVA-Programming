package OOP.Inheritance.Project1;

public class lesson_19_inheritance {

    public static void main (String[] args){
        //inheritance = the process where one class acquires,
                        //the attributes and methods of another class

        Car car = new Car();
        car.go();
        car.stop();

        System.out.println(car.doors);
        System.out.println(car.wheels);

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();

        System.out.println(bike.pedals);
        System.out.println(bike.wheels);
    }    

}
