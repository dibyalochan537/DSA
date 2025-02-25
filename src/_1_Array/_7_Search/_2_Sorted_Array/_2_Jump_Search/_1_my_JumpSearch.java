package _1_Array._7_Search._2_Sorted_Array._2_Jump_Search;

public class _1_my_JumpSearch {
    public int jump_Search(int[] array,int target){
        int start=0,step=(int)Math.floor(Math.sqrt(array.length));
        while(array[Math.min(step,array.length)-1]<target){
            start=step;
            step=step+(int)Math.floor(Math.sqrt(array.length));
            if(start>=array.length){
                return -1;
            }
        }
        while(array[start]<target){
            start++;
            if(start==Math.min(step,array.length)){
                return -1;
            }
        }
        if(array[start]==target){
            return start;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        _1_my_JumpSearch obj=new _1_my_JumpSearch();
        int[] array={1,2,3,4,5,7,8,56};
        int target=8;
        int positionOfTarget=obj.jump_Search(array,target);
        if(positionOfTarget==-1){
            System.out.println("Result Not Found");
        }
        else{
            System.out.println("Position of("+target+") is : "+positionOfTarget);
        }
    }
}
