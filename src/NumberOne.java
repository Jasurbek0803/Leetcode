public class NumberOne {
    public static void main(String[] args) {
        String str = "G:@℅e°¥n£iu∆|~s $C+/!o%d¢er™®s 3=•1";

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(isAlphabeticOrDigit(str.charAt(i))){
                res.append(str.charAt(i));
            }
        }
        System.out.println(res);
    }
    private static boolean isAlphabeticOrDigit(char ch){
        return Character.isAlphabetic(ch) ||  Character.isDigit(ch) || ch == ' ';
    }
}
