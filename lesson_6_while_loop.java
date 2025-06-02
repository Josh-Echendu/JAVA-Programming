import java.util.Scanner;

public class lesson_6_while_loop {
    public static void main(String[] args){
        System.out.println("While loop");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter value for X: ");
            int x = scan.nextInt();
            
            while(x>0){
                System.out.println("Current X: "+ x);
                x--;
            }
            System.out.println("Final x" +x);
            System.out.println();
        }
    }
