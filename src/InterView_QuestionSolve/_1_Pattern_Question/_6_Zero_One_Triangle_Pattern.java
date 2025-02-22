package InterView_QuestionSolve._1_Pattern_Question;

public class _6_Zero_One_Triangle_Pattern {
//    final int PI=78;
    public void printPattern(){
        int x=6;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if((i%2==0)&&(j%2!=0)){
                    System.out.print("0");
                }
                else if((i%2!=0)&&(j%2==0)){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _6_Zero_One_Triangle_Pattern obj=new _6_Zero_One_Triangle_Pattern();
        obj.printPattern();
    }
}
