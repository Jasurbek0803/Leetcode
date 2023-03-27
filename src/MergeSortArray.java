import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        int swap= 0;
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (; j < n;) {
                if (nums1[i] != 0){
                    break;
                }
                else{
                    nums1[i] = nums2[j];
                    j = j + 1;
                    break;
                }
            }
        }
        Arrays.sort(nums1);
        for (int i = 0; i < m+n; i++) {
            System.out.println(nums1[i]);
        }

        
    }
}
