import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetIndices {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) ans.add(i);

        }
    }
}
