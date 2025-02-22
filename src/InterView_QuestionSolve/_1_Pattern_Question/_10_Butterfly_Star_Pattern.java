package InterView_QuestionSolve._1_Pattern_Question;

public class _10_Butterfly_Star_Pattern {
    public void printPattern(){
        int row=12,middle=row/2;
        for(int i=1;i<=row;i++){
            if(i<=middle){
                for(int j=1;j<=row;j++){
                    if((j<=middle && j<=i) || j>(row-i)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=row;j++){
                    if((j<=middle && j<=(row-i+1)) || j>=i){
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
        _10_Butterfly_Star_Pattern obj=new _10_Butterfly_Star_Pattern();
        obj.printPattern();
    }
}
