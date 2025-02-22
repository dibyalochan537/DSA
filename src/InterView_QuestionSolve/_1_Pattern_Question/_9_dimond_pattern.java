package InterView_QuestionSolve._1_Pattern_Question;

public class _9_dimond_pattern {
    public static void main(String[] args) {
        int row=10;
        int middle=row/2;
        for(int i=1;i<=row;i++){
            if(i>=(middle+1)){
                for(int j=middle+1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<=row;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<=middle;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
