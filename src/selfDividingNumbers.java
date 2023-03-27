import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class selfDividingNumbers {
    public static void main(String[] args) {
        int left = 47;
        int right = 85;

        List<Integer> ans = new ArrayList<Integer>();

        for (int i = left; i <= right; i++) {
            if(checkNumber(i,i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
    public static boolean checkNumber(int num,int original){
        if(num % 10 == 0 || original % (num % 10) != 0) return false;
        if(num < 10) return true;
        return checkNumber(num/10,original);
    }
}
