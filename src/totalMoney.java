public class totalMoney {
    public static void main(String[] args) {
        int n = 20;

        int count = 0;
        int N = 1;
        int sum = 0;
        int[] nums = {1,2,3,4,5,6,7};

        for (int i = 1; i <= n; i++) {
            if(i != 1 && i % 7 == 1){
                N++;
                sum += N;
            }
            
        }

    }
}
