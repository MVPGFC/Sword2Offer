public class MinNumberInRotateArray {
    private static int findMinInArr(int[] array) {

        if (array.length == 0)
            return 0;

        int index1 = 0;
        int index2 = array.length - 1;
        int mid = index1;

        while (array[index1] >= array[index2]) {

            if (index2-index1 == 1) {
                mid = index2;
                break;
            }

            mid = (index1 + index2) / 2;

            if (array[index1] == array[index2] && array[index1] == array[mid])
                return findNormal(array, index1, index2);

            if (array[mid] > array[index1])
                index1 = mid;
            else if(array[mid] < array[index2])
                index2 = mid;
        }
        return array[mid];
    }

    private static int findNormal(int[] arr, int index1, int index2) {
        int res = arr[index1];
        for (int i = index1 +1; i <= index2; i++) {
            if (arr[i] < res)
                res = arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int res = findMinInArr(arr);
        System.out.println(res);
    }
}
