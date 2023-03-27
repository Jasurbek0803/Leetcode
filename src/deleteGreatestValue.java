import java.lang.reflect.Array;
import java.util.Arrays;

public class deleteGreatestValue {
    public static void main(String[] args) {
        int[][] grid = {{10}};

        int ans = 0;

        for (int i = 0; i < grid[0].length; i++) {
            int currMax = 0;
            for (int[] ints : grid) {
                int count1 = localMax(ints);
                currMax = Math.max(currMax, count1);
            }
            ans += currMax;
        }
        System.out.println(ans);

    }
    public static int localMax(int[] g){
        int max = g[0];
        int maxIndex = 0;

        for (int count = 1; count < g.length; count++) {
            if(max < g[count]){
                max = g[count];
                maxIndex = count;
            }
        }
        g[maxIndex] = -1;
        return max;
    }
}
