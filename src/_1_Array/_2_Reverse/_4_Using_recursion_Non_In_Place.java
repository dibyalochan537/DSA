package _1_Array._2_Reverse;

public class _4_Using_recursion_Non_In_Place{
    public void reverseArray(int[] array,int start,int end){
        int temp;
        if(start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
            reverseArray(array,start,end);
        }
        else{
            printArray(array,array.length);
        }
    }
    public void printArray(int[] array,int size){
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        _4_Using_recursion_Non_In_Place obj=new _4_Using_recursion_Non_In_Place();
        int[] array={1,2,3,4,5};
        obj.reverseArray(array,0,array.length-1);
    }
}
