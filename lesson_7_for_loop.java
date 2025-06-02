import java.util.Scanner;

public class lesson_7_for_loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num: ");
        
        int i = scan.nextInt();
        System.out.println(i);

        for(i=3; i>0; i--){
            System.out.println("current i: " + i);
        }
        System.err.println();

    }
}