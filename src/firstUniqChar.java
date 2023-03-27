import java.util.Arrays;

public class firstUniqChar {
    public static void main(String[] args) {
        String s = "loveleetcode";

        int[] counter = new int[26];
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i)-'a']++;
            chars[s.charAt(i) - 'a'] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if(s.charAt(i) == chars[j]){
                    if(counter[j] == 1){
                        System.out.println(s.charAt(i));
                    }
                }
            }
        }
    }
}
