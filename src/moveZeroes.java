import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,0,3,12,14,0,15,12,0};
        int[] copyNums = Arrays.copyOfRange(nums,0,nums.length);
        System.out.println(Arrays.toString(copyNums));
        int count = 0,count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(copyNums[i] != 0){
                nums[count++] = copyNums[i];
            }
            else {
                nums[copyNums.length-1-count1++] = copyNums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
