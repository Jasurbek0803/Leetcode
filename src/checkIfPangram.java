import java.util.Arrays;

public class checkIfPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        int[] nums = new int[26];

        for (int i = 0; i < sentence.length(); i++) {
            nums[sentence.charAt(i) - 'a']++;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 1){
                return; // false
            }
        }
    }
}
