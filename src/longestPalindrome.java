public class longestPalindrome {
    public static void main(String[] args) {
        String s = "cbbd";
        String str = "";
        String exprement = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= i + 1; j--) {
                exprement = s.substring(i, j);

                if (isPalindrome(exprement)) {
                    if (str.length() < exprement.length()) str = exprement;
                    break;
                }
//
            }

        }
        System.out.println(str);
    }

    public static boolean isPalindrome(String strings) {
        for (int i = 0; i < strings.length(); i++) {
            if (strings.charAt(i) != strings.charAt(strings.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
