import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams {
    public List<Integer> findAnagrams(String s, String p) {

        int len_s = s.length();
        int len_p = p.length();

        //If string length is less than the pattern length then return empty arraylist
        if(len_s < len_p) return new ArrayList<>();

        //Create frequency arrays to store the frequency of each character in winow and p_freq
        int[] p_freq = new int[26];
        int[] window = new int[26];

        //For the first window
        for(int i=0;i<len_p;i++){
            p_freq[p.charAt(i) - 'a']++;//update the frequency of character at i'th index
            window[s.charAt(i) - 'a']++;//update the frequency of character at i''th index
        }

        List<Integer> ans = new ArrayList<>();

        //Arrays.equals function check that two array are equivalent or not
        //if two array are qual means we found are anagram add it to arraylsit
        if(Arrays.equals(p_freq, window)) ans.add(0);

        //We have checked for first window so we will start from len_p

        for(int i=len_p;i<len_s;i++){

            //this is to remove the character from the starting of the window
            window[s.charAt(i-len_p) - 'a']--;

            //this is to add the character to the end of the window
            window[s.charAt(i) - 'a']++;

            //if two array are qual means we found are anagram add it to arraylsit
            if(Arrays.equals(p_freq, window)) ans.add(i-len_p+1);
        }
        return ans;
    }
}
