// import java.io.BufferedWriter; // Imported but commented out for use
import java.io.File;           // For file path representation
import java.io.FileWriter;     // For writing characters to a file
import java.io.IOException;    // For handling input/output errors
import java.util.Scanner;      // For reading input (including from files)

public class lesson_27_write_file {
    public static void main(String[] args) throws IOException{ // Declares that this method might throw IOException

        // --- PART 1: Reading content from josh.txt ---

        String file_path = "C:\\Users\\Admin\\Music\\JAVAs\\josh.txt";
        File file = new File(file_path); // Represents the path to josh.txt

        Scanner scan = new Scanner(file); // Opens josh.txt for reading using Scanner
        String file_content = ""; // Initialize an empty string to store all content

        // Loop to read each line from josh.txt
        while(scan.hasNextLine()){
            // Read the line and append it to file_content, followed by a newline character.
            // The '\n' is added because scan.nextLine() consumes the newline character,
            // so we add it back to maintain the original line breaks.
            file_content = file_content.concat(scan.nextLine()) + '\n';
        }

        System.out.println(file_content); // Print the collected content to the console
        scan.close(); // Close the Scanner to release resources from josh.txt

        // --- PART 2: Writing content to amaka.txt ---

        String write_file_path = "C:\\Users\\Admin\\Music\\JAVAs\\amaka.txt";
        // Creates a FileWriter to write to amaka.txt.
        // IMPORTANT: By default, FileWriter will OVERWRITE the file if it exists.
        // If "amaka.txt" doesn't exist, it will be created.
        FileWriter writer = new FileWriter(write_file_path);

        // Writes the entire collected content (file_content) to amaka.txt
        writer.write(file_content);

        writer.close(); // Close the FileWriter to ensure all data is written and resources are released

        // --- Commented-out section: Using BufferedWriter (as discussed previously) ---
        // BufferedWriter writer = new BufferedWriter(new FileWriter(write_file_path));
        // writer.write(file_content);
        // writer.close();
        // This commented-out section shows how you would use BufferedWriter, which is generally
        // preferred for performance when writing text to files, especially large ones.
        // It buffers the output, reducing the number of direct disk writes.
    }
}