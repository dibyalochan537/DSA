package InterView_QuestionSolve._1_Pattern_Question;

public class _14_Hollow_Triangle_Pattern {
    public void printPattern(){
        int row=6;
        for(int i=1;i<=row;i++){
            if(i==6){
                for(int j=1;j<=11;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=i;j<row;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    if(j==1||j==(2*i-1)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        _14_Hollow_Triangle_Pattern obj=new _14_Hollow_Triangle_Pattern();
        obj.printPattern();
    }
}
