public class removePalindromeSub {
    public static void main(String[] args) {
        String s = "abb";
        String str = "";
        System.out.println(isPalindrome(s));

        int count = 1;

        if(isPalindrome(s)){
            return; // return 1;
        }
        for (int i = 0; i < s.length()-1; i++) {
            if(String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(i+1)))){
                s = s.replace(s.substring(i,i+2),"");
                System.out.println(s);
                count++;
            }else{
                s = s.replace(s.substring(i,i+1),"");
                System.out.println(s);
                count++;
            }
        }
        System.out.println(s);
        System.out.println(count);


    }
    public static boolean isPalindrome(String str){
        int n = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
