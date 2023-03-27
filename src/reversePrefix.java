public class reversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd"; // dcbaefd
        char ch = 'i';
        String str1 = "";
        if(word.contains(ch + "")){
            String str = word.substring(0,word.indexOf(ch)+1);
            for (int i = str.length()-1; i >= 0 ; i--) {
                str1 += str.charAt(i);
            }
            str1 += word.substring(word.indexOf(ch)+1);
        }
    }
}
