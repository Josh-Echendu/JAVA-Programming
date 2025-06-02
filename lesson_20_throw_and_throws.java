public class lesson_20_throw_and_throws {
    public static int calculateFactorial(int n){
        if (n < 0){
            throw new IllegalArgumentException("cannot calculate factorial for a negative number");
        }

        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args){
        try{
            int factorial0f5 = calculateFactorial(5);
            System.out.println("Factorial of 5: "+ factorial0f5);
        
            int factorial0fNegative = calculateFactorial(-3);
            System.out.println("Factorial of -3: "+ factorial0fNegative);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
