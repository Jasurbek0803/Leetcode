import java.util.Objects;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";

        int maxLen = 0;


        int[] pos = new int[128];


        int start = 0, end = 0;

        for (char ch : s.toCharArray())
        {
            start  = Math.max(start, pos[ch]);

            maxLen = Math.max(maxLen, end-start+1);

            pos[ch] = end + 1;

            end++;
        }


        System.out.println(maxLen);
    }
}
