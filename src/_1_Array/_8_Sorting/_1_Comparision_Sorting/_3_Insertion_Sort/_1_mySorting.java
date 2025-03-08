package _1_Array._8_Sorting._1_Comparision_Sorting._3_Insertion_Sort;

import java.util.Arrays;

public class _1_mySorting {
    public int[] mySorting(int[] array,int start,int end){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            for(int j=i-1;j>=0;j--){
                if(temp<array[j]){
                    array[j+1]=array[j];
                    array[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        _1_mySorting obj=new _1_mySorting();
        int[] array={3,5,1,9,4,2};
        System.out.println("Before sorting : "+ Arrays.toString(array));
        array=obj.mySorting(array,0,array.length-1);

        System.out.println("After sorting : "+Arrays.toString(array));
    }
}
