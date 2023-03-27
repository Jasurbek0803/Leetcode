public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int n = 1;
        int cnt = 0;
        int ans = 0;
        for (int i = 0; i <= 1000; i++) {
            if(!ishave(arr, i, n)){
                if(cnt < k){
                    cnt++;
                }
            }

            if(cnt == k){
                System.out.println(arr[i]);
                break;
            }
            n++;
        }

    }
    private static boolean ishave(int[] nums,  int i, int n ){
        for (int j = i; j >= 0; j--) {
            if(j != nums.length && nums[j] == n) return true;
        }
        return false;
    }

}
