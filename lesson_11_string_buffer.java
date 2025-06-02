//A thread is an independent unit of execution within a program that can run concurrently with other threads.
//Safety in this context means ensuring correct and consistent behavior, especially when multiple threads are involved.
//Thread safety is the characteristic of code that guarantees its correct execution even when accessed by multiple threads simultaneously, typically by managing concurrent access to shared resources.

//As we discussed, String objects in Java are immutable. Every time you perform an operation that seems to modify a String (like concatenation using +), a brand new String object is created. 
//For a small number of operations, this is usually fine. However, if you're doing a lot of string manipulations within a loop or in a complex process, creating many temporary String objects can become inefficient in terms of performance and memory usage.

//StringBuilder and StringBuffer come to the rescue by providing mutable alternatives. They allow you to modify the sequence of characters they hold directly, without creating new objects for each change.

public class lesson_11_string_buffer {

    public static void main(String[] args){
        // Using DtringBuilder (single-threaded)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" world");

        // insert a some characters to the stringbuilder
        sb.insert(0, "Josh says ");
        System.out.println(sb);

        //delete char of index 3 to index 4
        sb.delete(3, 4);
        System.out.println(sb);

        // convert string buffer to string
        String finalStringSB = sb.toString();
        System.out.println("Final String (from StringBuilder): " + finalStringSB);

        //to thread safe
        System.out.println("\n--- StringBuffer (thread-safe) ---");
        StringBuffer sbuf = new StringBuffer("Java");
        
        sbuf.append(" is fun");
        System.out.println("StringBuffer: " + sbuf);

        sbuf.replace(3, 4, ".jpg");
        System.out.println("replace a with .jpg: "+ sbuf);
        
        String finalStringSBuf = sbuf.toString();
        System.out.println("Final String (from string StringBuffer): "+ finalStringSBuf);


        // StringBuffer sb = new StringBuffer("Echendu");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // sb.append(" joshua");
        // System.out.println(sb);

        // //Convert a string buffer to a string
        // String str = sb.toString();
        // System.out.println(str);

        // //Delete a character using index
        // sb.deleteCharAt(3);
        // System.out.println(sb);

        // // add characters '0' is the index it should start from
        // sb.insert(0, "java ");
        // System.out.println(sb);


    }
}
