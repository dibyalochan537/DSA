package _1_Array._5_Insertion;

import java.util.Arrays;

public class _2_Insertion_At_End {
    public  int[] insertionFunction(int[] array,int insertValue){
        int[] tempArray=new int[array.length+1];
        int i=0;
        while(i< array.length){
            tempArray[i]=array[i];
            i++;
        }
        tempArray[array.length]=insertValue;
        return tempArray;
    }
    public static void main(String[] args) {
        _2_Insertion_At_End obj=new _2_Insertion_At_End();
        int[] array={1,2,3,4,5};
        int insertValue=34;
        int[] insertedArray=obj.insertionFunction(array,insertValue);
        System.out.println("After insertion array is : "+ Arrays.toString(insertedArray));
    }
}
