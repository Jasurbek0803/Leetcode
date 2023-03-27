import java.util.Arrays;

public class findMinArrowShots {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};

        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int result = 1;
        int previous = 0;

        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > points[previous][1]){
                result++;
                previous = i;
            }
        }

        System.out.println(result);
//        int[] nums = new int[]
    }
}
