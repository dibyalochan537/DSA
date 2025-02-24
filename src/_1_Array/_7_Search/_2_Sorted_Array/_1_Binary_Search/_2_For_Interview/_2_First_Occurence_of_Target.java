package _1_Array._7_Search._2_Sorted_Array._1_Binary_Search._2_For_Interview;

public class _2_First_Occurence_of_Target{
    public static void main(String[] args) {
            int[] array={1,2,3,3,4,5,6,7};
            int target=9,start=0,end= array.length-1,result=-1,mid;
            while(start<=end){
                mid=(start+end)/2;
                if(array[mid]==target){
                    result=mid;
                    end--;
                }
                else if(array[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            if(result==-1){
                System.out.println("Result not found");
            }
            else{
                System.out.println("Result("+array[result]+") found at : "+result);
            }
    }
}
