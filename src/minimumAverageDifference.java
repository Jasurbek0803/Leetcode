public class minimumAverageDifference {
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};

        int minSum = Integer.MAX_VALUE, Index = 0;
        long UmumiyYigindi = 0;
        for (int i = 0; i < nums.length; i++) {
            UmumiyYigindi += nums[i];
        }
        long hozirgiYgindi = 0;
        for (int i = 0; i < nums.length; i++) {
            hozirgiYgindi += nums[i];

            long leftSum = hozirgiYgindi;
            leftSum /= (i+1);

            long rightSum = UmumiyYigindi - hozirgiYgindi;
            if(i != nums.length-1){
                rightSum /= (nums.length-i-1);
            }

            int farq = (int) Math.abs(rightSum - leftSum);
            if(minSum > farq){
                minSum = farq;
                Index = i;
            }

        }
    }
}
