import java.util.HashMap;

public class Lesson_22_Hashmaps {
    public static void main(String[] args){
        HashMap<String, Integer> empID = new HashMap<>();
        empID.put("ada", 1);
        empID.put("china", 2);
        empID.put("olu", 3);
        empID.put("mimi", 4);
        empID.put("josh", 5);
        System.out.println(empID);

        //Get the value of a key
        System.out.println(empID.get("mimi"));

        //check if hashmaps contains a particular key
        System.out.println(empID.containsKey("olu"));

        //check if hashmaps contains a particular key
        System.out.println(empID.containsKey("joj"));

         //check if hashmaps contains a particular value
        System.out.println(empID.containsValue(5));

        //update a value of a key
        empID.put("ada", 001);
        System.out.println(empID);

        //append a key-value pair if they dont exists
        empID.putIfAbsent("caleb", 6);
        System.out.println(empID);

        //append a key-value pair if they dont exists
        empID.putIfAbsent("ada", 6);
        System.out.println(empID);

        //remove an element
        empID.remove("caleb");
        System.out.println(empID);

        
    }
}
