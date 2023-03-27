import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addToArrayForm1 {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;

        int t= 0;
        List<Integer> ans = new ArrayList<>();


        for (int i = num.length-1; i >= 0 ; i--) {
            ans.add(0,(num[i] + k) % 10);
            k = (num[i] + k) / 10;

        }

        while(k > 0){
            ans.add(0,k %10);
            k /= 10;
        }
    }
}
