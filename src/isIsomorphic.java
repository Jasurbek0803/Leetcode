import java.util.Arrays;

public class isIsomorphic {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
//        int[] cnt = new int[s.length()];
//        System.out.println(Arrays.toString(cnt));
//        int[] cnt1 = new int[t.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
//                if(s.substring(i,i+1).equals(s.substring(j,j+1))){
//                    cnt[i]++;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(cnt));

        for (int i = 0; i < s.length(); i++) {
            int a = s.indexOf(s.charAt(i));
            int b = s.lastIndexOf(s.charAt(i));
            
        }

    }
//    public static boolean isNumberWhoseDigitsRepeat(String s, String t) {
//
//
////        while (N > 0){
////            int rem = N % 10;
////            cnt[rem]++;
////            N = N / 10;
////        }
//
//
//        int i = 0;
//        while(i < s.length()) {
//            if (cnt[i] > 1)
//                cnt[i]++;
//            i++;
//        }
//        return false;
//    }
}
