import java.util.Arrays;

public class trash777 {
    public static void main(String[] args) {
        int[][] matrix = {

                         {1,2,3},
                         {4,5,6},
                         {3,4,2}

                         };

        int[][][] nums = new int[matrix.length][matrix[0].length][3];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
             count = 1;
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) Math.pow(matrix[i][j],count++);
                }
            }
        }
        System.out.println(Arrays.deepToString(nums));
    }
}
