import java.lang.reflect.Array;
import java.util.Arrays;

public class maxOperations {
    public static void main(String[] args) {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;

        Arrays.sort(nums);
        int old = 0, orqa = nums.length-1, count = 0;

        while(old < orqa){
            if(nums[old] + nums[orqa] == k){
                old++;
                orqa--;
                count++;
            } else if (nums[old]+nums[orqa] > k) {
                orqa--;
            }
            else old++;
        }


    }
}
