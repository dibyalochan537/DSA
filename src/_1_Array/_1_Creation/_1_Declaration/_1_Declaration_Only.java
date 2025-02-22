package _1_Array._1_Creation._1_Declaration;

public class _1_Declaration_Only {
    public static void main(String[] args) {
        int []array;
        char []array2;
        float []array3;
        String []array4;
        array=new int[5];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        System.out.println("Array is :-");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
