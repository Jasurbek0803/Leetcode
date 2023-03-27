import java.util.Arrays;

public class binaryToDecimal {
    public static void main(String[] args) {
//        int[] binary = {0,1,1,0,1,0,1,0};
//        int sum = 0;
//        int count = 0;
//        for (int i = binary.length-1; i >= 0; i--) {
//            if(binary[i] != 0){
//                sum += Math.pow(2,count);
//            }
//            count++;
//        }
//        System.out.println(sum);

        int num = 106;
        int[] nums = new int[8];

        for (int i = nums.length-1; i >=0 && num != 0 ; i--) {
            nums[i] = num % 2;
            num /= 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
