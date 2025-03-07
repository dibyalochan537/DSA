package _1_Array._8_Sorting._1_Comparision_Sorting._1_Bubble_Sort;

public class _1_myTrial {
    public int[] bubbleSort(int[] array,int start,int end){
        int temp;
        boolean swap;
        for(int i=0;i<=end;i++){
            swap=false;
            for(int j=0;j<end-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        _1_myTrial obj=new _1_myTrial();
        int[] array={3,2,2,8,9,7,2,3};
        array=obj.bubbleSort(array,0,array.length-1);
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
}
