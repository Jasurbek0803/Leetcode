import java.util.Arrays;

public class checkInclusion {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        int[] a = new int[26];

        for (char ch: s1.toCharArray()) {
            a[ch - 'a']++;
        }

        int l1 = s1.length();
        int l2 = s2.length();

        for (int i = 0; i < l2-l1+1; i++) {
            int[] a2 = new int[26];
            for (int j = i; j < i+l1; j++) {
                a2[s2.charAt(i) - 'a']++;
            }
            if(Arrays.equals(a,a2)){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
