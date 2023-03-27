import static java.lang.Math.*;

public class isPowerOfFour {
    public static void main(String[] args) {
        int n = 2;

        int b = 4;

        double v = log(n) / log(b);

        if(Math.pow(b,v) == n){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        System.out.println(v);


    }


}
