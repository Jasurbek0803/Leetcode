import java.util.ArrayList;
import java.util.List;

public class countMatches1 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(
                List.of(
                        List.of("phone","blue","pixel"),
                        List.of("computer","silver","lenovo"),
                        List.of("phone","gold","iphone")
//                        List.of()
                )
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));

    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count1 = 0;

        int tcn = getTCN(ruleKey);
        for (List<String> item : items) {
            String s = item.get(tcn);
            if (ruleValue.equals(s)) {
                count1++;
            }


        }

        return count1;
    }
    public static int getTCN(String ruleKey){
        return switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
    }
}
