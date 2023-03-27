public class countSpecialNumbers {
    public static void main(String[] args) {
        int n = 135;

        for (int i = 1; i <= n; i++) {
            if (isNumberWhoseDigitsRepeat(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isNumberWhoseDigitsRepeat(int N) {
        int cnt[] = new int[10];

        while (N > 0){
            int rem = N % 10;
            cnt[rem]++;
            N = N / 10;
        }

        int i = 0;
        while(i < 10) {
            if (cnt[i] > 1)
                return true;
            i++;
        }
        return false;
    }
}
