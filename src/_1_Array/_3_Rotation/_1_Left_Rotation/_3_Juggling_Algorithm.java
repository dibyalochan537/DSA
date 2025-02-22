package _1_Array._3_Rotation._1_Left_Rotation;
import java.util.Arrays;
public class _3_Juggling_Algorithm{
    public static void leftRotate(int[] arr, int d, int n) {
        int g_c_d;
        if(n%d==0){
            g_c_d=n/d;
        }
        else{
            g_c_d=n%d;
        }
        System.out.println(g_c_d);

        // Process each cycle
        for (int i = 0; i < g_c_d; i++) {
            int temp = arr[i]; // Store the first element of the cycle
            int j = i;

            while (true) {
                int k = j + d;
                if (k >= n) k = k - n; // Wrap around the array
                if (k == i)
                    break; // If cycle is complete
                arr[j] = arr[k]; // Move element forward
                j = k;
            }
            arr[j] = temp; // Place stored value at correct position
        }
    }

    // Main function to test the algorithm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of positions to rotate
        int n = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        leftRotate(arr, d, n); // Rotate the array

        System.out.println("Left Rotated Array: " + Arrays.toString(arr));
    }
}
