public class lesson_10_string_2 {
    public static void main(String[] args){
       String message = new String("This is a message");
       System.out.println(message); 

       char[] charArray = {'j', 'a', 'v', 'a'};
       String fromCharArrayToString = new String(charArray);
       System.out.println(fromCharArrayToString);
       
        // This creates a new String "Hello World"
        // and the 'text' variable now refers to this new String.
        // The original "Hello" String still exists in memory.
       String text = "Hello";
       text = text + "World";

       System.out.println(text);

       String str1 = "Hello";
       String str2 = "Hello";
       String str3 = "hello";

       System.out.println("----------------------------------------------");
       System.out.println(str1.equals(str2)); // Output: true
       System.out.println(str1.equals(str3)); // Output: false
       System.out.println(str1 == str2);     // Output: true (due to String pooling for literals)
       System.out.println(str1 == str3);     // Output: false (different objects)
       
       System.out.println("---------------------------------------------");
       String sentence = "This is a simple sentence";
       System.out.println(sentence.contains("simple"));
       System.out.println(sentence.contains("josh"));

       //Exactly! Your C knowledge is serving you well in understanding the nuances. You've nailed the key difference:

       //C: String variables (especially character pointers or arrays) often directly represent or point to the starting memory address of the sequence of characters that make up the string. You're essentially working at the level of individual characters in memory.

      //Java: String variables hold a reference (memory address) to a String object in the heap. This String object is a higher-level entity that encapsulates the entire sequence of characters and provides methods to operate on that sequence. While internally the String object manages the characters in memory, your variable doesn't directly point to the first character's address. It points to the object as a whole.

      //This object-oriented approach in Java provides several advantages, such as built-in functionality (the methods we've discussed), immutability, and the String pool for efficient memory management of literals.

      //You're making excellent connections between the two languages! What aspect of Java strings would you like to explore next? We can delve into StringBuilder and StringBuffer, or perhaps some more String methods.

    }
}
