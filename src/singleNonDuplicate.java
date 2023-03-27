public class singleNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};

        int ans = -1;
        if(nums[0] != nums[1]) {
            System.out.println(nums[0]);
            return;
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            System.out.println(nums[nums.length-1]);
            return;
        }

        for (int i = 1; i < nums.length-1; i++) {

            if(!isDouble(nums,i)){
                ans = nums[i];
                break;
            }
        }
        System.out.println(ans);

    }
    private static boolean isDouble(int[] nums, int index){
        return nums[index - 1] == nums[index] || nums[index] == nums[index + 1];
    }

}
