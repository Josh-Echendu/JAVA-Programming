public class lesson_9_string_methods {
    public static void main(String[] args){
        String name = "Billy Bob Joe";

        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        char first_char = name.charAt(0);
        int length_s = name.length();
        char last_char = name.charAt(12);
        String sub_string = name.substring(10,13);

        System.out.println("Name: " + name);
        System.out.println("uppercase: "+ upper);
        System.out.println("lower: "+ lower);
        System.out.println("first_char: "+ first_char);
        System.out.println("length: "+ length_s);
        System.out.println("last char: " + last_char);
        System.out.println("substring: "+ sub_string);
    }
}
