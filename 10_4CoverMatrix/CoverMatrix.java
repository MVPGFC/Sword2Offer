public class CoverMatrix {
    public int RectCover(int target) {
        if (target < 1)
            return 0;

        int[] res = {1, 2};
        int way1 = 1;
        int way2 = 2;
        int wayRes = 0;

        if (target < 3)
            return res[target - 1];

        for (int i = 3; i <= target; i++) {
            wayRes = way1 + way2;

            way1 = way2;
            way2 = wayRes;
        }

        return wayRes;
    }
}
