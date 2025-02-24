package _1_Array._7_Search._2_Sorted_Array._1_Binary_Search._2_For_Interview;

public class _1_implementBinarySearchIterativeRecursive {
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
    public boolean recursiveBinarySearch(int[] array,int target,int start,int end){
        int mid=(start+end)/2;
        if(target<=array[array.length-1] && target>=array[0]){
            if(array[mid]==target){
                return true;
            }
            else if(array[mid]<target){
                return recursiveBinarySearch(array,target,mid+1,end);
            }
            else{
                return recursiveBinarySearch(array,target,start,mid-1);
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,4,6,7};
        int target=4;
        _1_implementBinarySearchIterativeRecursive obj=new _1_implementBinarySearchIterativeRecursive();
        boolean returnStatusIterative=obj.loopBinarySearch(array,target);
        boolean returnStatusRecursive=obj.recursiveBinarySearch(array,4654,0,array.length-1);
        System.out.println("Iterative status is : "+returnStatusIterative);
        System.out.println("Recursive status is : "+returnStatusRecursive);
    }
}
