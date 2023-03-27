public class countPrimes {
//    public static void main(String[] args) {
//        int n = 1500000000;
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if(isPrime(i)) count++;
//        }
////
////        System.out.println(isPrime(9));
//        System.out.println(count);
//    }
//
//    public static boolean isPrime(int n){
//        int num = 2;
//        if(n == 2) return true;
//        while(num <= (int)Math.sqrt(n)){
//            if(n % num == 0) return false;
//            num++;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        int n = 15;

        if(n < 3){
            System.out.println("0");
            return;
        }

        boolean[] booleans = new boolean[n];
        int count = n / 2;
        for (int i = 3; i*i < n; i += 2) {
            if(booleans[i]){
                continue;
            }
            for (int j = i*i; j < n; j += 2 * i) {
                if(!booleans[j]){
                    --count;
                    booleans[j] = true;
                }
            }
        }
        System.out.println(count);
    }
}
