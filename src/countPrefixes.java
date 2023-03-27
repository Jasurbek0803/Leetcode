public class countPrefixes {
    public static void main(String[] args) {
        String[] words = {"v","vmzl","vmzl","vmzl","vmzl","me",
                "rhh","v","vmzl","vmz","vmzl","vmzl","vm","vm",
                "vmzl","vmzl","hqvb","vmzl","t","v","vmz","vmzl",
                "gtra","v","gzh","vmz","vm","vmz","v","vmzl","vm",
                "vmz","vmz","jz","vm","z","jyrm","vmzl","v","v","vm"};


        String s = "vmzl";

        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(s.length() >= words[i].length()){
                if(words[i].contains(s.substring(0,words[i].length()))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
