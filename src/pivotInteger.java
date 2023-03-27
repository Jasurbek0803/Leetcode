public class pivotInteger {
    public static void main(String[] args) {
        int n = 8;

        int sum = 0,sum1 = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            for (int j = i; j <= n; j++) {
                sum1 += j;
            }
            if(sum == sum1){
                System.out.println(i);
            }
            else{
                sum1 = 0;
            }
        }
    }
}
