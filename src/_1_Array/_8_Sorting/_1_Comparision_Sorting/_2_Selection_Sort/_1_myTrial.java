package _1_Array._8_Sorting._1_Comparision_Sorting._2_Selection_Sort;

public class _1_myTrial {
    public int[] selectionSort(int[] array,int start,int end){
        int minIndex=0;
        for(int i=0;i<array.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        _1_myTrial obj=new _1_myTrial();
        int[] array={3,2,2,8,9,7,2,3};
        array=obj.selectionSort(array,0,array.length-1);
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
    }
}
