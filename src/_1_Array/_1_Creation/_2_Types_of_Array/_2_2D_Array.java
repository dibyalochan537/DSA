package _1_Array._1_Creation._2_Types_of_Array;

public class _2_2D_Array {
    public static void main(String[] args) {
        //Declaration Only
        int[][] array1;
        //Declaration with initialization
        int[][] array2={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] array3=new int[3][3];
        //Access array1
        //Access Array2
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[0].length;j++){
                System.out.print(array2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
