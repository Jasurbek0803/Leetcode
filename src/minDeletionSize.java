import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class minDeletionSize {
    public static void main(String[] args) {
        String[] strs = {"cba","daf","ghi"};
//        cba
//        daf
//        ghi


//        zyx
//        wvu
//        tsr
//        String[] strs2 = new String[strs[0].length()];
//
//
//        int count = 0;
//
//        for (int i = 0; i < strs2.length; i++) {
//            strs2[i] = "";
//            for (String str : strs) {
//                strs2[i] += str.charAt(i);
//            }
//        }
//        String[] copy_strs2 = Arrays.copyOfRange(strs2,0,strs2.length);
//
//        for (int i = 0; i < copy_strs2.length; i++) {
//            char[] chars = copy_strs2[i].toCharArray();
//            Arrays.sort(chars);
//            copy_strs2[i] = "";
//            for (char aChar : chars) {
//                copy_strs2[i] += aChar;
//            }
//            if(!strs2[i].equals(copy_strs2[i])){
//                count++;
//            }
//        }
////        System.out.println(count);
////        System.out.println(Arrays.toString(strs2));
////        System.out.println(Arrays.toString(copy_strs2));
        int count = 0;

        for (int ustun = 0; ustun < strs[0].length(); ustun++) {
            for (int qator = 1; qator < strs.length; qator++) {
                if(strs[qator].charAt(ustun) < strs[qator-1].charAt(ustun)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
