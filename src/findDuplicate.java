import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int result = 0;
        boolean[] hasNum = new boolean[nums.length];
        for (int i=0; i<nums.length; i++) {
            if (hasNum[nums[i]]) {
                result = nums[i];
                break;
            }
            hasNum[nums[i]] = true;
        }
        System.out.println(result);

    }
}
