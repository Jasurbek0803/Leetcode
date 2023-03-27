import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class destCity {
    public static void main(String[] args) {

        List<List<String>> paths = new ArrayList<>(Collections.singleton(Arrays.asList("B", "C")));
        paths.add(Arrays.asList("D", "B"));
        paths.add(Arrays.asList("C", "A"));


//        "D" -> "B" -> "C" -> "A".
//        "B" -> "C" -> "A".
//        "C" -> "A".
//        "A".




    }
}
