import java.lang.reflect.Array;
import java.util.Arrays;

public class countConsistentStrings {
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};


        int count = 0;

        for (String str: words) {
            int count1 = 0;
            for (int i = 0; i < str.length(); i++) {
                if(allowed.contains(String.valueOf(str.charAt(i)))){
                    count1++;
                }
            }
            if(count1 == str.length()){
                count++;
            }
        }
        System.out.println(count);
    }
}
