import java.util.ArrayList;
import java.util.Arrays;

public class lesson_21_array_list {
    public static void main(String[] args){

        String[] fruits = new String[4];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        fruits[3]= "pineapple";

        for(int i=0; i<4; i++){
            System.out.println(fruits[i]);
        }

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("watermelon");
        System.out.println(fruitList);

        fruitList.remove("Mango");
        System.out.println(fruitList);

        boolean tangerine = fruitList.contains("tangerine");
        System.out.println(tangerine);

        fruitList.clear();
        System.out.println(fruitList);

        //second array example
        ArrayList<String> friendlist2 = new ArrayList<>(Arrays.asList("ada", "china", "olu", "mira")); 
        
        //Get an element
        System.out.println(friendlist2.get(2));     
        
        //Get the length
        System.out.println(friendlist2.size());

        // set an element
        friendlist2.set(0, "amaka");
        System.out.println(friendlist2.get(0));
        System.out.println(friendlist2);

        //remove an element
        friendlist2.remove(2);
        System.out.println(friendlist2);

    }
}
