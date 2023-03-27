import java.util.Arrays;
import java.util.Enumeration;

public class minimumAbsDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        Arrays.sort(arr);

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int a = Math.min(arr[i] - arr[j],arr[j]- arr[i]);
                if(min > a){
                    min = a;
                }
            }
        }
        System.out.println(min);
    }
}
