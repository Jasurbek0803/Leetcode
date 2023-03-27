import java.util.Arrays;

public class replaceDigits {
    public static void main(String[] args) {
        String s = "a1b2c3d4e"; // abbdcfdhe


        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0)
                res.append(s.charAt(i));
            else
                res.append((char) (s.charAt(i - 1) + Integer.parseInt(String.valueOf(s.charAt(i)))));
        }

    }
}
