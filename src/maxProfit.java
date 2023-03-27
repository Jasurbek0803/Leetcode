import java.util.Arrays;

public class maxProfit {
    public static void main(String[] args) {
        int[] prices = {7,4,8,3,6,1};

        int max = prices[prices.length-1];
        int distance = 0;
        for (int i = prices.length-2; i >= 0; i--) {
            if(max >= prices[i]){
                if(distance < (max - prices[i]))
                    distance = max - prices[i];
            }
            else{
                max = prices[i];
            }
        }
        System.out.println(distance);
    }
}
