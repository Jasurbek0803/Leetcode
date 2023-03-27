import java.util.Arrays;

public class search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        Arrays.sort(nums);

        int head = 0;
        int tail = nums.length - 1;
        int mid;

        while (head <= tail){
            mid = (head + tail) / 2;
            if(nums[mid] == target){
                System.out.println(mid);
                break;
            }
            if(nums[mid] < target){
                head = mid + 1;
            }
            if(nums[mid] > target){
                tail = mid - 1;
            }
        }
    }
}
