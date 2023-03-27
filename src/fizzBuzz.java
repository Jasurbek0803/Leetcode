import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public static void main(String[] args) {
        int n = 15;

        List<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = i+1;
            if(a % 3 == 0 && a % 5 == 0){
                res.add("FizzBuzz");
            }else if(a % 3 == 0 && a % 5 != 0){
                res.add("Fizz");
            } else if (a % 3 != 0 && a % 5 == 0) {
                res.add("Buzz");
            }else res.add(String.valueOf(a));
        }
        System.out.println(res);

    }
}
