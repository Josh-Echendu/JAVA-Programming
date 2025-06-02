public class lesson_13_method_in_class {
    // overloaded methods = methods that share the same name but different parameter
    //               same name + different parameter or datatype or number of parameters = method signature

    //In Java, you can have multiple functions within the same class that share the same name, 
    //as long as they have different parameter lists. The parameter list includes the number of parameters,
    // the data types of the parameters, and the order of the parameters. 

    //When you call the add() function in the main method, 
    //the Java compiler looks at the arguments you provide and chooses the add() function that has a matching parameter list.

    //The return type of the function does not affect overloading.
    public static void main(String[] args) {
        System.out.println(add(4, 5));
        System.out.println(add(4, 5, 10));
        System.out.println(add(4, 5, 10, 15));

        //double
        System.out.println(add(4.5, 5.5));
        System.out.println(add(4.5, 5.5, 10.5));
        System.out.println(add(4.5, 5.5, 10.5, 15.5));
    }

    public static int add(int a, int b){
        System.out.println("first method: 1");
        return a+b;
    }

    public static int add(int a, int b, int c){
        System.out.println("first method: 2");
        return a+b+c;
    }

    public static int add(int a, int b, int c, int d){
        System.out.println("first method: 4");
        return a+b+c+d;
    }

    
    public static double add(double a, double b){
        System.out.println("first method: 5");
        return a+b;
    }

    public static double add(double a, double b, double c){
        System.out.println("first method: 6");
        return a+b+c;
    }

    public static double add(double a, double b, double c, double d){
        System.out.println("first method: 3");
        return a+b+c+d;
    }
}
