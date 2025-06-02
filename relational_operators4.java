public class relational_operators4 {

    public static void main(String[] args){
        boolean a=true, b=false, c=true, d=false;
        
        if(a&&c) System.out.println("A and C are both true");
        if(a&&b) System.out.println("a and b noth true");
        if(a||b) System.out.println("at least one of them is true");
        if(a||c) System.out.println("at least of othem is true");
        if(d||b) System.out.println("atleast one of them is true");
        if(!b) System.out.println("value of b is false");
        if(!a) System.out.println("value of a is false");

    }    
}
