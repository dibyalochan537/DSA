package _1_Array._2_Reverse;

public class _2_Using_loop_In_Place {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int start=0,end=array.length-1,temp;
        while(start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println("Output of Reverse Array :-");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
