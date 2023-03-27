import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class addBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String ans = "";

        BigInteger binary1 = BigInteger.valueOf(Long.parseLong(a));

//        long binary1 = Long.parseLong((a));
//        long binary2 = Long.parseLong(b);
//
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//            ans +=sum[i--];
//        }
//        System.out.print(ans);
        ArrayList<String> arrayList = new ArrayList<>();
        int n = 0;
        int i = a.length()-1;
        int remainder = 0;
        for (int j = b.length()-1; j >= 0; j--) {
            Integer x = Integer.parseInt(String.valueOf(a.charAt(i--)));
            Integer y = Integer.parseInt(String.valueOf(b.charAt(j)));
            arrayList.add(n++,String.valueOf((x + y + remainder) % 2));
            remainder = (x + y + remainder) / 2;

            if(remainder != 0){
                arrayList.add(n++, String.valueOf(remainder));
            }
            --n;
            while (n >= 0) {
                ans += arrayList.get(n--);
            }
        }
        System.out.println(ans);
    }
}
