package _1_Array._6_Deletion;

import java.util.Arrays;

public class _1_At_Start {
    public int[] deletionFunction(int[] array,int deletePosition){
        int i=1;
        while(i<array.length){
            array[i-1]=array[i];
            i++;
        }
        array[array.length-1]=0;
        return array;
    }
    public static void main(String[] args) {
        _1_At_Start obj=new _1_At_Start();
        int[] array={1,2,3,4,5};
        int deletePosition=0;
        int[] deletedArray=obj.deletionFunction(array,deletePosition);
        System.out.println("After deletion Array is : "+ Arrays.toString(deletedArray));
    }
}
