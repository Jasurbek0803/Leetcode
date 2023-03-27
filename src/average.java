import java.util.ArrayList;
import java.util.Arrays;

public class average {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        int[] nums = new int[salary.length];
        double sum = 0.0;
        System.arraycopy(salary, 0, nums, 0, nums.length);
        Arrays.sort(nums);

        for (int j : salary) {
            if (j != nums[0] && j != nums[nums.length - 1]) {
                sum += j;
            }
        }
        System.out.println(sum / (salary.length - 2.0));
    }
}
