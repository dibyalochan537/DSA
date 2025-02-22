package InterView_QuestionSolve._1_Pattern_Question;

public class _13_Mirror_Image_Triangle {
    public void printPattern(){
        int x=11,y=5;
        for(int i=1;i<=x;i++){
            if(i<=6){
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j<=6;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            else{
                for(int j=i;j<x;j++){
                    System.out.print(" ");
                }
                for(int j=y;j<=6;j++){
                    System.out.print(j+" ");
                }
                y--;
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        _13_Mirror_Image_Triangle obj=new _13_Mirror_Image_Triangle();
        obj.printPattern();
    }
}
