import java.util.Arrays;

public class BuildProductArr {
    private static int[] multiply(int[] A) {
        int length = A.length;
        if(length<2)
            return A;
        int[] B = new int[length];
        B[0] = 1;
        for (int i = 1; i < length; i++) {
            B[i] = B[i-1] * A[i-1];
        }
        int temp =1;
        for (int i = length-2; i >= 0 ; i--) {
            temp = temp * A[i+1];
            B[i] = B[i] *temp;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] inArr = {1,2,3,4,5};
        int[] outArr = multiply(inArr);
        System.out.println(Arrays.toString(outArr));
    }
}
