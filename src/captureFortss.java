import java.lang.reflect.Array;
import java.util.Arrays;

public class captureFortss {
//    int[] forts = ;

    public static void main(String[] args) {
        System.out.println(captureForts(new int[]{1,0,0,-1,0,0,0,0,1}));


    }
    public static int captureForts(int[] forts){
        int max = 0;

        for (int i = 0; i < forts.length; i++) {
            if(forts[i] == 1){
                for (int j = i+1; j < forts.length; j++) {
                    if(forts[j] == -1){
                        max = Math.max(max, j-i-1);
                        break;
                    } else if (forts[j] == 1) {
                        break;

                    }
                }
            } else if (forts[i] == -1) {
                for (int j = i+1; j < forts.length; j++) {
                    if(forts[j] == 1){
                        max = Math.max(max,j-i-1);
                        break;
                    }else if(forts[j] == -1){
                        break;
                    }
                }
            }
        }
        return max;
    }
}
