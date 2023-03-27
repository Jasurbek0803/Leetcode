public class countDigitOnes {
    public static void main(String[] args) {
        System.out.println(countDigitOne(2)); // trash
    }

    public static  int countDigitOne(int n) {
        if(n >= 1 && n < 10) return 1;


        if(n < 10){
            return 0;
        }
        int currNum = n;
        int count = 0;
        while(currNum > 0){
            if(currNum % 10 == 1){
                count++;
            }
            currNum /= 10;
        }
        return n-10 + countDigitOne(n-1);
//        if(n == 0) return 0;
//        else if(n < 10) return 1;
//
//        if(n < 10){
//            return n-10 - 2;
//        }
//        int currNum = n;
//        int count = 0;
//        while(currNum > 0){
//            if(currNum % 10 == 1){
//                count++;
//            }
//            currNum /= 10;
//        }
//        return 1 + count + countDigitOne(n-1);
    }
}
