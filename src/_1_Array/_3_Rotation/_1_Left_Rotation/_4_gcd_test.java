package _1_Array._3_Rotation._1_Left_Rotation;

public class _4_gcd_test {
    public static void main(String[] args) {
        int x=25,y=5,gcd;
        if(x<y){
            if(y%x==0){
                gcd=y/x;
                System.out.println(gcd);
            }
            else{
                gcd=y%x;
                System.out.println(gcd);
            }
        }
        else if(x==y){
            gcd=x;
            System.out.println("GCD is : "+gcd);
        }
        else{
            if(x%y==0){
                gcd=x/y;
                System.out.println(gcd);
            }
            else{
                gcd=x%y;
                System.out.println(gcd);
            }
        }
    }
}
