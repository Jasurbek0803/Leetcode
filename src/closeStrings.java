public class closeStrings {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";

        if(word1.length() != word2.length()) System.out.println(false);

        String word1Copy = String.copyValueOf(word1.toCharArray());
        String word2Copy = String.copyValueOf(word2.toCharArray());
        int count = 1;
        String a = "";
        for (int i = 0; i < word1.length(); i++) {
            for (int j = i+1; j < word1.length(); j++) {
                if(word1.indexOf(word1.charAt(i)) > 0){
                    count++;
                    word1 = word1.replaceFirst(word1.substring(j,j+1),"");
                }
            }
            a += count;
            count = 1;
        }
        System.out.println(a);
    }
}
