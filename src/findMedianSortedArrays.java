import java.util.Arrays;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,7};

        int[] numbers = new int[nums1.length + nums2.length];

        int count = 0;
        for (int n : nums1) numbers[count++] = n;
        for (int m: nums2) numbers[count++] = m;
        Arrays.sort(numbers);

        double middle = 0.0;
        if(numbers.length % 2 == 0){
            middle = numbers[numbers.length/2];
            middle+= numbers[numbers.length/2 -1];
            middle /= 2.0;
        }
        else{
            middle = numbers[numbers.length/2];
        }
        System.out.println(middle);
    }
}
