import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] chars = Arrays.copyOfRange(s,0,s.length);


        for (int i = 0; i < s.length; i++) {
            s[i] = chars[chars.length-1-i];
        }
        System.out.println(Arrays.toString(s));
    }
}
