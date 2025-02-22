package _1_Array._7_Search._1_Unsorted_Array._1_Linear_Search;

public class _1_LinearSearch {
    public int x(int y){
        if(y<98){
            return y;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        _1_LinearSearch obj=new _1_LinearSearch();
        int v=obj.x(99);
        System.out.println(v);
    }
}
