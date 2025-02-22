package _1_Array._1_Creation._1_Declaration;

import java.util.Scanner;

public class _3_Declaration_Initialization {
    public static void main(String[] args) {
        int[] array=new int[5];
        char []array2=new char[5];
        float []array3=new float[5];
        String []array4=new String[5];
        Scanner sc=new Scanner(System.in);
        //Integer
        System.out.println("Enter data to integer :-");
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
        //Character
        System.out.println("Enter data to Character :-");
            for(int i=0;i<array2.length;i++){
                array2[i]=sc.next().charAt(0);
            }
        //Float
        System.out.println("Enter data to Float :-");
            for(int i=0;i<array3.length;i++){
                array3[i]=sc.nextFloat();
            }
        //String
        System.out.println("Enter data to String :-");
            for(int i=0;i<array4.length;i++){
                array4[i]=sc.nextLine();
            }
        System.out.println("Output for Integer :-");
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        System.out.println("Output for Character :-");
            for(int i=0;i<array2.length;i++){
                System.out.print(array2[i]+" ");
            }
        System.out.println("Output for Float :-");
            for(int i=0;i<array3.length;i++){
                System.out.print(array3[i]+" ");
            }
        System.out.println("Output for String :-");
            for(int i=0;i<array4.length;i++){
                System.out.print(array4[i]+" ");
            }
    }
}
