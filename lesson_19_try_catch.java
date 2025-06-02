import java.util.Scanner;

public class lesson_19_try_catch {
    public static void main(String[] args){
        try{
            int[] a = {10, 200, 35};
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = scan.nextInt();
            System.err.println(a[n]);
        }
        catch(Exception e){
            System.out.println("index is larger than array size"+ e);

        }
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = scan.nextInt();
            System.out.println(n);
        }
        catch(Exception ex){
            System.out.println("value is not an integer"+ ex);

        }
        try{
            int a[] = {4};
            System.out.println(a[1]);
        }
        catch(NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("the final block would always execute");
        }
}
}