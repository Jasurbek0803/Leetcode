

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class countBits {
    public static void main(String[] args) {
        int n = 5;

        int[] bitSum = new int[n+1];

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            String s = Integer.toBinaryString(i);
            for (char c : s.toCharArray()) {
                sum += Integer.parseInt(c + "");
            }
            bitSum[i] = sum;
        }

    }
}
