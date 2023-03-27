import java.util.Arrays;

public class sortArray1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{4, 3, 2, 1})));
    }
    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int len = max - min;
        int[] arr = new int[len + 1];
        for (int num : nums) {
            arr[num - min]++;
        }
        int index = 0;
        for (int i = 0; i <= len; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }
            min++;
        }
        return nums;
    }
}
