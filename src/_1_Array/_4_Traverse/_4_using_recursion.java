package _1_Array._4_Traverse;

import java.util.Arrays;
public class _4_using_recursion{
    public int[] traverseArray(int[] array,int i){
        if(i>=array.length){
            return array;
        }
        else{
            return traverseArray(array,i+1);
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        _4_using_recursion obj=new _4_using_recursion();
        int[] newArray=obj.traverseArray(array,0);
        System.out.println("Array is : "+Arrays.toString(array));
    }
}
