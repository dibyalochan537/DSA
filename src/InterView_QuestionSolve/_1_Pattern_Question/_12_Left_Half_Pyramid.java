package InterView_QuestionSolve._1_Pattern_Question;

public class _12_Left_Half_Pyramid {
    public void printPattern(){
        int x=5;
        for(int i=1;i<=x;i++){
            for(int j=i;j<x;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _12_Left_Half_Pyramid obj=new _12_Left_Half_Pyramid();
        obj.printPattern();
    }
}
