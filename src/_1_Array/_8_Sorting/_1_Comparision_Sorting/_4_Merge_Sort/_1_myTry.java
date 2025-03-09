package _1_Array._8_Sorting._1_Comparision_Sorting._4_Merge_Sort;

import java.util.Arrays;

public class _1_myTry {
    public int[] mergeSort(int[] array){
        return array;
    }
    public static void main(String[] args) {
        _1_myTry obj=new _1_myTry();
        int[] array={4,2,6,9,1,8,7};
        System.out.println("Before sorting : "+ Arrays.toString(array));
        array=obj.mergeSort(array);
        System.out.println("After sorting : "+Arrays.toString(array));
    }
}
