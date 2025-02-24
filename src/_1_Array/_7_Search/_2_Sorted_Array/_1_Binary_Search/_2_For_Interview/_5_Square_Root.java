package _1_Array._7_Search._2_Sorted_Array._1_Binary_Search._2_For_Interview;

public class _5_Square_Root {
    public static void main(String[] args) {
        int x=8,result;
        if (x == 0 || x == 1){
            result=x;
        }

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid =(right+left)/2;

            if (mid*mid == x) {
                result=mid;
            } else if (mid*mid < x) {
                ans = mid; // Store potential answer
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        result=ans;
        System.out.println(result);
    }
}
