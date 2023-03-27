import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class frequencySort {
    public static void main(String[] args) {
        String s = "raaeaedere";
        int[] chars = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
        int min = chars[i];
            for (int j = 0; j < chars.length; j++) {
                if(min > chars[j]){
                    min = chars[j];
                }
            }
            chars[i] = min;
        }
        System.out.println(Arrays.toString(chars));
    }
}
