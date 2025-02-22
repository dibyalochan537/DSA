package InterView_QuestionSolve._1_Pattern_Question;

public class _15_Hallow_Reverse_Triangle {
    public void printPattern(){
        int row=6,m=1;
        for(int i=1;i<=row;i++){
            if(i==1){
                for(int j=1;j<=11;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=11-2*m;j++){
                    if(j==1||j==11-2*m){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                m++;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        _15_Hallow_Reverse_Triangle obj=new _15_Hallow_Reverse_Triangle();
        obj.printPattern();
    }
}
