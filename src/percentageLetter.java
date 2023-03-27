public class percentageLetter {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';



        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                count++;
            }
        }
        System.out.println(count * 100 / s.length());

    }
}
