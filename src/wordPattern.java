import java.util.Arrays;
import java.util.Objects;

public class wordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern1("aaaaaa","dog cat cat dog cow cow"));
    }
    public static boolean wordPattern1(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;
        String[] a = new String[26];
        for (int i = 0; i < arr.length; i++) {
            a[pattern.charAt(i) - 'a'] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (!a[pattern.charAt(i) - 'a'].equals(arr[i]))
                return false;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = i + 1; j < 26; j++) {
                if (a[i] != null && a[j] != null && a[i].equals(a[j]))
                    return false;
            }
        }
        return true;
    }
}
