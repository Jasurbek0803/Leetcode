public class maximumCount {
    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,2,3};
        StringBuilder str = new StringBuilder("");

        int head = 0;
        int tail = nums.length - 1;
        int mid;

        for (int i = 0; i < nums.length / 2; i++) {
            mid = (head + tail) / 2;

            if(nums[mid] <= 0){
                head = mid + 1;
            }
            if(nums[mid] >= 0){
                tail = mid - 1;
            }

        }
        if(nums[head] > 0){
            head -= 1;
        }
        if(nums[tail] < 0){
            tail += 1;
        }
        System.out.println(nums.length-1 - head);
        System.out.println(tail + 1);
        System.out.println(Math.max(nums.length-1 - head,tail + 1));
    }
}
