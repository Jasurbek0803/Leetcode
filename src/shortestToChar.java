import java.util.Arrays;

public class shortestToChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            nums[i] = Math.min(Math.abs(s.indexOf(c) - s.indexOf(s.charAt(i))), Math.abs(s.lastIndexOf(c) - s.indexOf(s.charAt(i))));
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("[3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]");
    }
}
