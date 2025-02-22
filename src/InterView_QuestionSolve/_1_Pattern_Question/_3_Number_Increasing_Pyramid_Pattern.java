package InterView_QuestionSolve._1_Pattern_Question;

public class _3_Number_Increasing_Pyramid_Pattern {
    public void printPattern(){
        int x=10;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _3_Number_Increasing_Pyramid_Pattern obj=new _3_Number_Increasing_Pyramid_Pattern();
        obj.printPattern();
    }
}
