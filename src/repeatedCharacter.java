import java.util.Arrays;

public class repeatedCharacter {
    public static void main(String[] args) {
        String s = "eesll";

        int[] counter = new int[26];
        char ch = '+';
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a'] = s.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
//            counter[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(counter));
            if(++counter[s.charAt(i) - 'a'] >= 2){
                ch = chars[s.charAt(i)- 'a'];
                break;
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(counter));
        System.out.println(ch);
    }
}
