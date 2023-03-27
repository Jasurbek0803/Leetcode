import java.util.Arrays;
import java.util.Scanner;

public class Ntauchun_EKUB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nechta son uchun EKUB topamiz : ");

        int[] nums = new int[255]; // foydalanuvchi kiritgan sonni shu yerda saqlesan

        int n = scanner.nextInt(); // nechta sonligini qabul qilish

        int count = 0; // necha marta aylanish

        while (count < n){
            System.out.printf("%d - sonni kiriting : ",  count+1);

            int num = scanner.nextInt();  // sonni qabul qilamiz

            nums[count] = num;  // massivga solamiz

            count++;
        }


        int gcd = gcd(nums[0], nums[1]);
        int n1 = 2;

        while(n1 < nums.length && nums[n1] != 0){
            gcd = gcd(gcd, nums[n1]);
            n1++;
        }

        System.out.println(gcd);
    }
    public static int gcd(int a, int b) { //  2 ta son uchun EKUB function
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
