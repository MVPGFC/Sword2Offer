import java.util.Arrays;

public class UtilTest {
    public static void bubbleSort(int[] arr){
        //要测试的算法
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        //交换方法
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rightMathod(int[] arr){
        //系统提供的排序方法
        Arrays.sort(arr);
    }

    public static int[] generateRanddomArray(int size, int value){
        //Math.random() -> double[0,1); 左闭右开
        //(int)((size+1) * Math.random()) -> [0, size]; 左闭右闭整数
        //size为数组长度

        //生成长度随机的数组
        int[] arr = new int[(int)((size+1) * Math.random())];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)((value + 1) * Math.random() - (int)(value * Math.random()));
        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        //复制数组的值
        if (arr == null){
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            res[i] = arr[i];
        }
        return res;
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        //比较两个数组的值是否一样
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)){
            return false;
        }
        if (arr1 == null && arr2 == null){
            return true;
        }
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr){
        //输出数组
        if (arr == null){
            return;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++){
            int[] arr1 = generateRanddomArray(size, value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            bubbleSort(arr1);
            rightMathod(arr2);
            if (!isEqual(arr1, arr2)){
                succeed = false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRanddomArray(size, value);
        printArray(arr);
        System.out.println("数组长度为："+arr.length);
    }

}
