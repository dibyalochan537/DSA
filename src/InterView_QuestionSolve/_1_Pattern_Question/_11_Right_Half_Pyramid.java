package InterView_QuestionSolve._1_Pattern_Question;

public class _11_Right_Half_Pyramid {
    public void printPattern(){
        int x=5;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _11_Right_Half_Pyramid obj=new _11_Right_Half_Pyramid();
        obj.printPattern();
    }
}
