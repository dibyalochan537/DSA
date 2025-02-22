package InterView_QuestionSolve._1_Pattern_Question;

public class _4_Number_Increasing_Reverse_Pyramid_Pattern {
    public void printPattern(){
        int x=5;
        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _4_Number_Increasing_Reverse_Pyramid_Pattern obj=new _4_Number_Increasing_Reverse_Pyramid_Pattern();
        obj.printPattern();
    }
}
