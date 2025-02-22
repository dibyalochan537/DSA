package _1_Array._7_Search._1_Unsorted_Array._1_Linear_Search;

public class _2_linear_search_using_recursion {
    public int searchOperation(int[] array,int target,int index){
        int i=index;
        if(i==array.length){
                return -1;
        }
        else if(target==array[i]){
            return i;
        }
        else{
            return searchOperation(array,target,i+1);
        }
    }
    public static void main(String[] args) {
        _2_linear_search_using_recursion obj=new _2_linear_search_using_recursion();
        int[] array={1,5,3,6,7,9,8,4,98};
        int target=array[6];
        int returnTarget=obj.searchOperation(array,target,0);
        System.out.println((returnTarget==-1)?"This("+target+") is not situated in Array":"This("+target+") situated in : "+returnTarget+"th Position of Array");
    }
}
