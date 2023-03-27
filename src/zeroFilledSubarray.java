public class zeroFilledSubarray {
    public static void main(String[] args) {
        int[] nums = {0,0,0,2,0,0};


//        int count = countZero(nums);
//
//        System.out.println(count);
        long cnt = 0, zeroSubarraysEndingAtCurrentIndex = 0;
        for (int n : nums) {
            if (n == 0) {
                cnt += ++zeroSubarraysEndingAtCurrentIndex;
            }else {
                zeroSubarraysEndingAtCurrentIndex = 0;
            }
        }

        System.out.println(cnt);

    }
//    private static int countZero(int[] arr){
//        int ans = 0;
//
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0){
//                ans++;
//                for (int j = i+1; j < arr.length; j++) {
//                    if(arr[i] == arr[j]){
//                        ans++;
//                    } else if (arr[i] != arr[j]) {
//                        break;
//                    }
//
//                }
//            }
//        }
//        return ans;
//    }
}
