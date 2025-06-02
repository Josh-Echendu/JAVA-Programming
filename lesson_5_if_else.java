import java.util.Scanner;

public class lesson_5_if_else {
    public static void main(String[] args){

        // Create a user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");

        // store user input
        int n = scan.nextInt();
        
        if (n>=90 && n<=100){
            System.out.println("A");
        }
        else if(n>=80 && n <90){
            System.out.println("B");
        }
        else if(n>=70 && n<80){
            System.out.println("C");
        }
        else if(n>=65 && n<70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        
        //print userinput
        System.out.println(n);
    }
}
 