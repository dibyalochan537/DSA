package InterView_QuestionSolve._1_Pattern_Question;

public class _8_Rhombus_Pattern {
    public void printPattern(){
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _8_Rhombus_Pattern obj=new _8_Rhombus_Pattern();
        obj.printPattern();
    }
}
