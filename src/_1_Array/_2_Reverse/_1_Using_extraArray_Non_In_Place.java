package _1_Array._2_Reverse;

public class _1_Using_extraArray_Non_In_Place {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int[] newArray=new int[array.length];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=array[array.length-1-i];
        }
        System.out.println("Output of NewReverse Array :-");
        System.out.print("[");
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.print("]");
    }
}
