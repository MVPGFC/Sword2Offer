public class FibonaciiSeries {

    public int Fibonacci(int n) {
        int[] arr = {0,1};
        if (n<2)
            return arr[n];

        int fibonacii1 = 0;
        int fibonacii2 = 1;
        int fibN = 0;
        for (int i = 2; i < n; i++) {
            fibN = fibonacii1 + fibonacii2;

            fibonacii1 = fibonacii2;
            fibonacii2 = fibN;
        }

        return fibN;
    }
}
