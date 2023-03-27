import java.util.Arrays;

public class SingleNumberII {
    /**  Example 137 */


    public static int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int i = 0;
        for (int j = 0; j < nums.length / 3; j++) {
            if((nums[i] == nums[i+1] && nums[i] == nums[i+2]) && i < nums.length -3){
                i += 3;
            }
        }
        return nums[i];
    }
}
