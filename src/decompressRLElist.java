import java.lang.reflect.Array;
import java.util.Arrays;

public class decompressRLElist {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }
        System.out.println(length);

        int[] res = new int[length];
        int count = 0;
        for (int i = 1; i < nums.length; i += 2) {
            int count1 = 0;
            while(count1++ < nums[i-1]){
                res[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
