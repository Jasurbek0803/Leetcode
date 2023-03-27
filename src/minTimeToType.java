public class minTimeToType {
    public static void main(String[] args) {
        String word = "bza"; // 1974


        int cur = 'a';
        int lastcur = 'z';

        int a = 'a';

        int z = 'z';

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            int x = word.charAt(i) - cur;
            int y = lastcur - word.charAt(i);

            if(x > y){
                cur = y;
                System.out.println("y: "+y);
            }else {
                cur = x;
                System.out.println("x :" + x);
            }

        }

    }
}
