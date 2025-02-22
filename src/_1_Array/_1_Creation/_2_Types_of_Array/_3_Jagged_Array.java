package _1_Array._1_Creation._2_Types_of_Array;

import java.util.Scanner;

public class _3_Jagged_Array {
    public static void main(String[] args) {
        int [][] array=new int[3][];
        Scanner sc=new Scanner(System.in);
        array[0]=new int[2];
        array[1]=new int[3];
        array[2]=new int[4];
        System.out.println("Enter Array Element:-");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array is :-");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
