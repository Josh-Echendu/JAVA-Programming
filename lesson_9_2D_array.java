public class lesson_9_2D_array {
    public static void main(String[] args){
        int num[][] = {{20, 15, 7},
                       {8, 7, 19}, 
                       {7, 13, 47}
                      };
        System.out.println(num[0][2]);
        System.out.println(num[1][2]);
        System.out.println(num[2][2]);

        for(int i=0; i<3; i++){
        // System.out.println("\n");
        for(int j=0; j<3; j++){
            System.out.print(num[i][j] + "\t"); // Print element and a tab

        }
        System.out.println();
    }
    }
}