public class lesson_12_functions {

    public static int sum(int a, int b){
        int sumz = a + b;
        return sumz;
    }

    public static int myFunction(int input1, String input2) {
        // Function body - performs some operation
        int result = input1 * 2;
        System.out.println("Input string: " + input2);
        return result;
    }
    
    public static void anotherFunction() {
        // Function body - performs some action, returns nothing
        System.out.println("This function does not return a value.");
    }

    public static void helloWorld(){
        for(int i = 0; i<5; i++){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args){
        int output = myFunction(5, "Hello"); // Calling myFunction and storing the result
        anotherFunction(); // Calling anotherFunction
        System.out.println("Output from myFunction: " + output);
        
        int c = sum(3,6);
        helloWorld();
        System.out.println(c);
  }

}
