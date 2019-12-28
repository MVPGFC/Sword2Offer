import com.sun.javaws.jnl.LDUpdater;

public class DuplicateInArr {

    private static boolean duplicate(int[] numbers, int length, int[] duplication) {
        if (length <= 1 || numbers == null)
            return false;

        for (int i = 0; i < length; i++) {
            if (numbers[i] > length-1 || numbers[i] < 0)
                return false;
        }

        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                int m = numbers[i];
                if (numbers[m] == numbers[i]) {
                    duplication[0] = m;
                    return true;
                } else {
                    int tmp = numbers[i];
                    numbers[i] = numbers[tmp];
                    numbers[tmp] = tmp;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,0,2,5,3};
        int[] arr2 = {1,2,3,4,5,6,6};
        int length = arr.length;
        int[] res = new int[1];
        boolean flag = duplicate(arr2, length, res);
        System.out.println(flag);
        System.out.println(res[0]);
    }
}
