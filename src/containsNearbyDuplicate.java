import java.util.Arrays;

public class containsNearbyDuplicate {
    public static void main(String[] args) {
         int[] nums = {1,2,3,1};
         int k = 3;

         boolean[] bytes = new boolean[nums.length];
         int a = 0;
         int b = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    a = i;
                    b = j;
                    break;
                }
            }
        }


    }
}
