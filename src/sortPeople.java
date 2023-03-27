import java.util.Arrays;

public class sortPeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        String[] res = new String[names.length];
        int swap = 0;
        int max = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if(max < heights[i]){
                swap = max;
                max = heights[i];
                heights[i] = swap;
            }

        }
        System.out.println(Arrays.toString(heights));
    }
}
