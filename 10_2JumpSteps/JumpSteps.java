public class JumpSteps {

    public int JumpFloor(int target) {

        if (target < 1)
            return 0;

        int[] res = {1,2};
        int step1 = 1;
        int step2 = 2;
        int stepRes = 0;

        if (target < 3)
            return res[target-1];

        for (int i = 3; i <= target; i++) {
            stepRes = step1 + step2;

            step1 = step2;
            step2 = stepRes;
        }

        return stepRes;
    }

}
