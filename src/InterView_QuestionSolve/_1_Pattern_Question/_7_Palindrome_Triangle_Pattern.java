package InterView_QuestionSolve._1_Pattern_Question;

public class _7_Palindrome_Triangle_Pattern {
    public void printPattern(){
        int row=10;
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        _7_Palindrome_Triangle_Pattern obj=new _7_Palindrome_Triangle_Pattern();
        obj.printPattern();
    }
}
