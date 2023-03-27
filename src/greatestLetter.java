import java.lang.reflect.Array;
import java.util.Arrays;

public class greatestLetter {
    public static void main(String[] args) {
        String s = "lEeTcOdEbBC";
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                if(s.indexOf((char)(s.charAt(i) + 32)) > -1){
                    chars[(s.charAt(i) + 32) - 'a'] = (char) (s.charAt(i));
                }
            } else if (Character.isLowerCase(s.charAt(i))) {
                if(s.indexOf((char)(s.charAt(i) - 32)) > -1){
                    chars[s.charAt(i) - 'a'] = (char) (s.charAt(i) - 32);
                }
            }
        }

        for (int i = chars.length-1; i >= 0; i--) {
            if(chars[i] != '\u0000'){
                System.out.println(chars[i]);
                break;
            }
        }

        System.out.println(Arrays.toString(chars));
    }
}
