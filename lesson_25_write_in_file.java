import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class lesson_25_write_in_file {
    public static void main(String[] args){
        try {
            ArrayList<String> names = new ArrayList<>(Arrays.asList("john", "carl", "jerry"));

            System.out.println(names);
            
            //instatiate a writer object to the BufferedWriter class
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Music\\JAVAs\\josh.txt"));
            
            // writes to a file
            writer.write("Josh, the greatest, writes to a file....");
            writer.write("\njosh always smile...");

            //iterate over an array
            for(String name: names){
                writer.write("\n" + name);
            }

            //close the file
            writer.close();

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            BufferedWriter numbersInFile = new BufferedWriter(new FileWriter("amaka.txt"));
            
            numbersInFile.write("..............................");

            for(Integer number1: numbers){
                numbersInFile.write("\n" +number1);
            }
            numbersInFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}