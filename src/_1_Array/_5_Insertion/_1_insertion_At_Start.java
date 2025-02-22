package _1_Array._5_Insertion;

import java.util.Arrays;

public class _1_insertion_At_Start {
    public int[] insertionFunction(int[] array,int insertValue){
        System.out.println(Arrays.toString(array));
        int[] tempArray=new int[array.length+1];
        int i=0;
        while(i<array.length){
            tempArray[i+1]=array[i];
            i++;
        }
        tempArray[0]=insertValue;
        return tempArray;
    }
    public static void main(String[] args) {
        _1_insertion_At_Start obj=new _1_insertion_At_Start();
        int[] array={1,2,3,4,5};
        int insertValue=2;
        int[] insertedArray=obj.insertionFunction(array,2);
        System.out.println("After inserted array is : "+ Arrays.toString(insertedArray));
    }
}
