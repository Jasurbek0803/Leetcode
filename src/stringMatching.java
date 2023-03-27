import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringMatching {


    public static void main(String[] args) {
        
//sentence
        String[] words = {"vaxbc","kvaxbcta","npn","vaxbcrb","oovy","ikvaxbctaug","gpnok",
                          "yvaxbcrb","vfoa","rmikvaxbctaug","igu","rmigu"};
//                  "vaxbc","kvaxbcta","vaxbcrb","ikvaxbctaug","igu"

        List<String> res = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                if(!word.equals(words[i])){
                    if(words[i].contains(word)){
                        if(!res.contains(word)){
                            res.add(word);
                        }
                    }
                }
                else {
                    continue;
                }
            }
        }

        System.out.println("vaxbc, kvaxbcta, vaxbcrb, ikvaxbctaug, igu");
        System.out.println(res);


    }
}
