public class nextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';

        int len = letters.length;
        if(letters[len -1] < target){
            System.out.println(letters[0]);
            return;
        }
        for (int i = 0; i < len; i++) {
            if(letters[i] > target){
                System.out.println(letters[i]);
                return;
            }
        }
    }
}
