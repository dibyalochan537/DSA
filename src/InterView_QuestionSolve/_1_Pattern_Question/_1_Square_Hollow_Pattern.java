package InterView_QuestionSolve._1_Pattern_Question;

public class _1_Square_Hollow_Pattern {
    public void anathorWayPrintPattern(){
        int x=6;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(i==0||i==(x-1)||j==0||j==(x-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void printPattern(){
        int x=6;
        for(int i=0;i<x;i++){
            if(i==0||i==(x-1)){
                for(int j=0;j<x;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=0;j<x-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        _1_Square_Hollow_Pattern obj=new _1_Square_Hollow_Pattern();
        obj.printPattern();
        obj.anathorWayPrintPattern();
    }
}
