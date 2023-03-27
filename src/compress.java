import java.util.*;


public class compress { // trash
    public static void main(String[] args) {
        char[] chars = {'a','b','b','c','c'};

        Set<Character> list = new HashSet<>();

        for (int i = 0; i < chars.length-1; i++) {
            list.add(chars[i]);
        }

        System.out.println(list);
        System.out.println(list.size());

    }
}
