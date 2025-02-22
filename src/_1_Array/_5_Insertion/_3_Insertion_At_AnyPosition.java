package _1_Array._5_Insertion;

import java.util.Arrays;

public class _3_Insertion_At_AnyPosition{
    public int[] insertionFunction(int[] array,int insertValue,int insertPosition){
        int[] tempArray=new int[array.length+1];
        int i=0;
        while(i<array.length){
            if(i<insertPosition){
                tempArray[i]=array[i];
            }
            else{
                tempArray[i+1]=array[i];
            }
            i++;
        }
        tempArray[insertPosition]=insertValue;
        return tempArray;
    }
    public static void main(String[] args) {
        _3_Insertion_At_AnyPosition obj=new _3_Insertion_At_AnyPosition();
        int[] array={1,2,3,4,5};
        int insertValue=34,insertPosition=2;
        int[] insertedArray=obj.insertionFunction(array,insertValue,insertPosition);
        System.out.println("After inserted Array is : "+ Arrays.toString(insertedArray));
    }
}
