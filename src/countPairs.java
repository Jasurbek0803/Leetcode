public class countPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;

        int res = 0;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i+1; j < nums.length; j ++ ) {
                if( i * j % k == 0 && nums[i] == nums[j]){
                    res++;
                    System.out.println(nums[i] + " " + nums[j]);
                }
            }
        }

        System.out.println("res : " + res);
    }
}
