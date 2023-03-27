import java.util.Arrays;

public class ToqqizYuzBesh {
    public static void main(String[] args) {
        int[] nums = {1,4,4,5,6,7,8};
        int[] ans = new int[nums.length];
        int leftcount = 0;
        int rightcount = nums.length-1;

//        for (int i = 0; i < nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] % 2 == 0){
                    ans[leftcount++] = nums[j];
                    System.out.println(Arrays.toString(ans));
                }
                else {
                    ans[rightcount--] = nums[j];
                    System.out.println(Arrays.toString(ans));
                }
            }
//        }
        System.out.println(Arrays.toString(ans));
    }
}
