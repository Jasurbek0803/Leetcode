public class mergeAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq"; // "apbqcd"
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if(i < word1.length()){
                res.append(word1.charAt(i));
            }
            if(i < word2.length()){
                res.append(word2.charAt(i));
            }
        }
        System.out.println(res);
    }
}
