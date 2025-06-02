import java.io.File;
import java.io.FileNotFoundException; // Import for handling file not found errors
import java.util.Scanner; // Import for reading input (including from files)

public class lesson_26_read_File {
    public static void main(String[] args) throws FileNotFoundException{ // Declares that this method might throw FileNotFoundException

        String file_path = "C:\\Users\\Admin\\Music\\JAVAs\\josh.txt";
        // 1. Creating a File object:
        //    This line creates an object that represents the *path* to your file.
        //    It's like writing down the address of a house. It doesn't open the house yet.
        File file = new File(file_path);

        // 2. Creating a Scanner to read from the File:
        //    Scanner is a versatile class that can read input from various sources,
        //    including files. Here, you're telling the Scanner to read from the 'file' object.
        //    This is where the program actually tries to *open* the file for reading.
        Scanner scan = new Scanner(file);

        // 3. Reading the file line by line:
        //    scan.hasNextLine() checks if there's another line to read in the file.
        //    scan.nextLine() reads the entire next line and moves the scanner to the next line.
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine()); // Print each line to the console
        }

        // 4. Getting file properties using the File object:
        //    These methods are called on the 'file' object (the address/blueprint),
        //    not on the 'scan' object (the reader).
        System.out.println(file.getAbsolutePath()); // Prints the full, absolute path of the file
        System.out.println(file.exists());          // Checks if the file actually exists at that path (returns true/false)
        System.out.println(file.getName());         // Prints just the name of the file (e.g., "josh.txt")
        System.out.println(file.getParentFile());   // Prints the path to the directory containing the file
        System.out.println(file.length() + " bytes"); // Prints the size of the file in bytes

        // IMPORTANT: Close the Scanner to release file resources.
        // If you don't close it, the file might remain locked or resources might leak.
        scan.close();
    }
}




// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class lesson_26_File {
//     public static void main(String[] args) throws FileNotFoundException{

//         String file_path = "C:\\Users\\Admin\\Music\\JAVAs\\josh.txt";
//         File file = new File(file_path);
//         Scanner scan = new Scanner(file);

//         while(scan.hasNextLine()){
//             System.out.println(scan.nextLine());

//         }

//         System.out.println(file.getAbsolutePath()); //C:\Users\Admin\Music\JAVAs\josh.txt
//         System.out.println(file.exists());//true
//         System.out.println(file.getName()); //josh.txt
//         System.out.println(file.getParentFile()); //C:\Users\Admin\Music\JAVAs
//         System.out.println(file.length() + " btyes");
        
//     }    
// }
