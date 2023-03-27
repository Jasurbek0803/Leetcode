import javax.print.DocFlavor;

public class isAlienSortedEXM {
    public static void main(String[] args) {

    }

    public boolean isAlienSorted(String[] words, String order) {
        char[] alphabet = new char[order.length()];

        for (int i = 0; i < order.length(); i++) {
            alphabet[i] = order.charAt(i);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j == i + 1; j++) {
                if(words[i].length() > words[j].length()){
                    if(get(words,alphabet,i,j,words[j])) continue;
                    else return false;
                }else{
                    if(get(words,alphabet,i,i,words[j])){
                        continue;
                    }else return false;
                }
            }
        }
        return true;
    }
    private boolean get(String[] words, char[] alphabet, int i, int j, String word){
        for (int k = 0; k < words[j].length(); k++) {
            if(charA(words[i].charAt(k),alphabet) > charA(word.charAt(k),alphabet)){
                return false;
            } else if (charA(words[i].charAt(k),alphabet) < charA(word.charAt(k),alphabet)) {
                return true;
            }
        }
        return words[i].length() == words[j].length();
    }

    public int charA(char a,  char[] alpha){
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i] == i) return i;
        }
        return -1;
    }


}
