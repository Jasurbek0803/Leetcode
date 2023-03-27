import java.util.Arrays;

public class findGCD {
    public static void main(String[] args) {
        int[] nums = {7,5,6,8,3};
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length-1];

        while (a != b)
        {
            if (a > b) a %= b;
            else b %= a;

            if (a == 0) a = b;
            if (b == 0) b = a;
        }
        System.out.println(a);
    }
}
