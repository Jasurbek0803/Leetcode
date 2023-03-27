import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {1,3,9};
        int extraCandies = 4;

        List<Boolean> res = new ArrayList<>();
        int max = 0;
        int maxCur =  maxNum(Arrays.copyOfRange(candies, 0, candies.length ));
        for (int i = 0; i < candies.length; i++) {
            int curNum = candies[i] + extraCandies;
            if( curNum >= maxCur){
                res.add(true);
//                maxCur = Math.max(maxCur, curNum);
            }else{
                res.add(false);
            }

        }
        System.out.println(res);
    }
    public static int maxNum(int[] nums){
        int max = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
}
