import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; // 2,3,5,4,1,7
        int n = 3;
        int[] n1 = new int[nums.length];
        int count = 0;
        for(int i = 0; i < n1.length; i+=2){
            n1[i] = nums[count];
                n1[i+1] = nums[n+count++];

        }

//        for(int i = 1; i < n1.length; i+=2){
//            if(n+i < n1.length){
//                n1[i] = nums[n+i];
//            }
//        }
        System.out.println(Arrays.toString(n1));
    }
}
