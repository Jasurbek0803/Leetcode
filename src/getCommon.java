public class getCommon {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        int min = Integer.MAX_VALUE;
        for (int j : nums1) {
            if (search(nums2, j)) {
                min = Math.min(min, j);
            }
        }
        System.out.println(min);

    }
    private static boolean search(int[] nums2, int target){
        boolean res = false;

        int head = 0;
        int tail = nums2.length - 1;


        while(head <= tail){
            int mid = (head + tail) / 2;
            if(nums2[mid] == target){
                return true;
            }
            if(nums2[mid] < target){
                head = mid + 1;
            }
            if(nums2[mid] > target){
                tail = mid - 1;
            }
        }
        return res;
    }
}
