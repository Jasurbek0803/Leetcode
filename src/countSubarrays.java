import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countSubarrays {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        List<Integer> x = new ArrayList<>();
        x.add(2);

        int n = nums.length;
        int leftBound = -1;
        int lastMin = -1, lastMax = -1;
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                lastMin = (nums[i] == minK) ? i : lastMin;
                lastMax = (nums[i] == maxK) ? i : lastMax;
                count += Math.max(0, Math.min(lastMin, lastMax) - leftBound);
            } else {
                leftBound = i;
                lastMin = -1;
                lastMax = -1;
            }
        }

        System.out.println(count);
    }


}
