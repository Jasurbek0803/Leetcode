public class trash3232 {
    public static void main(String[] args) {
        String text = "aaabbaaa";

        int[] count = new int[26];
        int[] left = new int[text.length()];
        int[] right = new int[text.length()];
        int max = 0;

        for (int i = 0; i < text.length(); i++) {
            count[text.charAt(i) - 'a']++;
            if(i > 0){
                if(text.charAt(i) == text.charAt(i-1)){
                    left[i] = left[i-1] + 1;
                }else{
                    left[i] = 1;
                }
            }else{
                left[i] = 1;
            }
            max = Math.max(max,left[i]);
        }
        for (int i = text.length()-1; i >= 0; i--) {
            if(i < text.length() - 1){
                if(text.charAt(i+1) == text.charAt(i)){
                    right[i] = right[i + 1] + 1;
                }else{
                    right[i] = 1;
                }
            }else{
                right[i] = 1;
            }
        }

        for (int i = 1; i < (text.length() - 1); i++) {
            if(text.charAt(i-1) == text.charAt(i+1) && text.charAt(i) != text.charAt(i-1) ){
                
            }
        }
    }

}
