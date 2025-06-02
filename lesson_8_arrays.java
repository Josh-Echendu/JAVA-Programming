public class lesson_8_arrays {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6};
        
        //length of array num
        System.err.println("length of array: "+ num.length);

        int sumz = 0;
        for(int i = 0; i<num.length; i++){
            sumz = sumz + num[i];
            System.out.println(num[i]);
        }
        System.out.println("Total: "+ sumz);

    }   
}
