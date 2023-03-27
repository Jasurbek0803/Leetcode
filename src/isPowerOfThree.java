public class isPowerOfThree {
    public static void main(String[] args) { // trash
        int n = 45;

        if(n <= 0){
            System.out.println(false);
            return;
        }
        while(n % 3 == 0 || n != 1){
            n /= 3;

        }
        System.out.println(n);
    }
}
