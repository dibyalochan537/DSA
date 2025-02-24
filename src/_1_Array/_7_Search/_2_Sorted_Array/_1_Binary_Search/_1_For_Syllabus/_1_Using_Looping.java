package _1_Array._7_Search._2_Sorted_Array._1_Binary_Search._1_For_Syllabus;

public class _1_Using_Looping {
    public boolean loopBinarySearch(int[] array,int target){
        int start=0,end=array.length-1,mid=(start+end)/2,temp;
        while(array[mid]!=target && (target>=array[0] && target<=array[array.length-1])){
            mid=(start+end)/2;
            if(array[mid]<target){
                start=mid-1;
            }
            else{
                end=mid+1;
            }
        }
        if(array[mid]==target){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,4,6,7};
        int target=4;
        _1_Using_Looping obj=new _1_Using_Looping();
        boolean returnStatus=obj.loopBinarySearch(array,target);
        System.out.println(returnStatus);
    }
}
