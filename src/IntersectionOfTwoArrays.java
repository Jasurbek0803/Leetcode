import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        String s = "";

//        for (int n:nums1) {
//            for (int m:nums2) {
//                if(!s.contains(new String(String.valueOf(n))) && n == m){
//                    s += n + ",";
//                }
//            }
//        }
//        System.out.println(s);
//
//        String[] strings = s.split(",");
//        int[] ans = new int[strings.length];
//        if(s.length() != 0){
//            for (int i = 0; i < ans.length; i++) {
//                ans[i] = Integer.parseInt(strings[i]);
//            }
//        }
//        System.out.println(Arrays.toString(ans));
        nums1 =  java.util.stream.IntStream.of(nums1).distinct().toArray();
        nums2 =  java.util.stream.IntStream.of(nums2).distinct().toArray();

        for (int n:nums1) {
            for (int m:nums2) {
                if(n == m){
                    s += n + "#";
                }
            }
        }
        String[] str = s.split("#");
        int[] ans = new int[str.length];

        if(str.length == 0) System.out.println(new int[0]);
        else{
            for (int i = 0; i < ans.length; i++) {
                ans[i] = Integer.parseInt(str[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
