package InterView_QuestionSolve._1_Pattern_Question;

public class _2_Number_Triangle_Pattern {
    public void printPattern(){
        int x=6;
        for(int i=1;i<=x;i++){
            for(int j=x;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _2_Number_Triangle_Pattern obj=new _2_Number_Triangle_Pattern();
        obj.printPattern();
    }
}
