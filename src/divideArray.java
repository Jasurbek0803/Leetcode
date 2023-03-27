import java.util.Arrays;

public class divideArray {
    public static void main(String[] args) {
        int[] res = new int[501];


        int[] nums = {3,2,3,2,2,2};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            res[nums[i]]++;
        }
        for (int i = 0; i < res.length; i++) {
            if(res[i] % 2 == 0){
                count += res[i] / 2;
            }
        }

        System.out.println(Arrays.toString(res));
        System.out.println(count);
    }
}
