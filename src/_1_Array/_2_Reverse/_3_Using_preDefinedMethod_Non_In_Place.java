package _1_Array._2_Reverse;
import java.util.Arrays;
public class _3_Using_preDefinedMethod_Non_In_Place {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Using inbuilt method in Java
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Print the reversed array
        System.out.println(Arrays.toString(reversedArray));
    }
}
