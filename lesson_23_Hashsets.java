import java.util.HashSet;

public class lesson_23_Hashsets {
    public static void main(String[] args){
        HashSet<Integer> hashbrowns = new HashSet<>();
        hashbrowns.add(1);
        hashbrowns.add(3);
        hashbrowns.add(5);

        Object[] h1 = hashbrowns.toArray();
        System.out.println(h1[0]);
        System.out.println(hashbrowns);
        
        System.out.println();
        System.out.println("------------------------------hashsets--for--strings--------------------");
        HashSet<String> h = new HashSet<>();
        h.add("lemur");
        h.add("orangutan");
        h.add("spider monkey");
        h.add("silverback gorilla");

        System.out.println(h);
        h.remove("silverback gorilla");
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("lemur"));
        h.clear();
        System.out.println(h);
        h.clear();
        System.out.println(h.isEmpty());


        
    }
}
