public class jump {
    public static void main(String[] args) { // trash
        int[] nums = {2,3,0,1,4};

        int index = 0;
        int count = 0;
        while (index < nums.length-1){
            int currIndex = nums[index];
            int max = nums[index+1];
            for (int i = index+2; i <= currIndex; i++) {
                if(max < nums[i]){
                    max = nums[i];
                }
            }
            index += max;
            count++;
        }
        System.out.println(count);
    }
}
