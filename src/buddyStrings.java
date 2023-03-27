import java.util.Arrays;

public class buddyStrings { //trash
    public static void main(String[] args) {
        String s = "abcaa"; // trash
        String goal = "abcbb";




//        int count = 0;
//        int counter = 0;
//        char[] chars = new char[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) != goal.charAt(i)){
//                chars[s.charAt(i)-'a'] = s.charAt(i);
//                chars[goal.charAt(i)-'a'] = goal.charAt(i);
//            }
//            if(i!= s.length()-1 && s.charAt(i) == s.charAt(i+1)){
//                counter++;
//            }
//
//        }
//        if(counter == s.length()){
//            return;
//        }
//
//
//
//        System.out.println(Arrays.toString(chars));
//        System.out.println(count);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)){
                String str1 = s.replace(s.charAt(i),goal.charAt(i));
                String str2 = s.replace(goal.charAt(i),s.charAt(i));
                if(str1.equals(str2)){
                    System.out.println(true);
                    break;
                }
            }
        }

    }
}
