package _1_Array._3_Rotation._1_Left_Rotation;

public class _2_Rotate_Using_Temp_Array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] tempArray=new int[array.length];
        int termRotate=2;
        for(int i=0;i<termRotate;i++){
            for(int j=termRotate;j<array.length;j++){
                tempArray[j-2]=array[j];
            }
            tempArray[array.length-2+i]=array[i];
        }
        System.out.println("Final output after rotate :-");
        for(int i=0;i<array.length;i++){
            System.out.print(tempArray[i]+" ");
        }
    }
}
