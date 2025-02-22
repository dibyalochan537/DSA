package _1_Array._3_Rotation._1_Left_Rotation;

public class _1_Rotate_One_By_One {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int termRotate=2,temp;
        for(int i=0;i<termRotate;i++){
            temp=array[0];
            for(int j=0;j<array.length;j++){
                if(j==array.length-1){
                    array[j]=temp;
                }
                else{
                    array[j]=array[j+1];
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array [i]+" ");
        }
    }
}
