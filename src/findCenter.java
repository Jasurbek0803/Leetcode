public class findCenter {
    public static void main(String[] args) {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};

        int[][] nums = new int[edges.length + 1][2];

        int count = 0;

        int max = 0;
        int maxNum = 0;

        for (int i = 0; i < edges.length; i++) {
            int have = isHave(nums, edges[i][0],i+1);
            if(have != -1){
                nums[have][1]++;
                if(max < nums[have][1]){
                    maxNum = nums[have][0];
                }
            }else{
                nums[count][0] = edges[i][0];
                nums[count++][1]++;
            }

            int have1 = isHave(nums, edges[i][1],i+1);
            if(have1 != -1){
                nums[have1][1]++;
                if(max < nums[have1][1]){
                    maxNum = nums[have1][0];
                }
            }else{
                nums[count][0] = edges[i][1];
                nums[count++][1]++;
            }

        }

//        int max = nums[0][1];
//        int maxNum = nums[0][0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i][1] > max){
//                max = nums[i][1];
//                maxNum = nums[i][0];
//            }
//        }

        System.out.println(maxNum);
//
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i][0] + " | " + nums[i][1]);
        }
    }
    public static int isHave(int[][] nums, int n,int index){
        for (int i = 0; i < index; i++) {
            if(nums[i][0] == n){
                return i;
            }
        }
        return -1;
    }
}
