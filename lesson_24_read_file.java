import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lesson_24_read_file {
    public static void main(String[] args) throws IOException{
        String file_path = "C:\\Users\\Admin\\Music\\JAVAs\\josh.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
         
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
