import java.util.Arrays;

public class arrayPairSum {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2}; // [1,2,2,5,6,6] 1-6 2-6 2-5
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length-1; i+=2) {
            min += Math.min(nums[i],nums[i+1]);
        }
        System.out.println(min);
    }
}
