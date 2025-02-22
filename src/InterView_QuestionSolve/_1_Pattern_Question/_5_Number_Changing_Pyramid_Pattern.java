package InterView_QuestionSolve._1_Pattern_Question;

public class _5_Number_Changing_Pyramid_Pattern {
    public void printPattern(){
        int x=5,num=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _5_Number_Changing_Pyramid_Pattern obj=new _5_Number_Changing_Pyramid_Pattern();
        obj.printPattern();
    }
}
