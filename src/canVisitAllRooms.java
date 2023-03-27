import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class canVisitAllRooms { // uyga   trash
    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>(
                List.of(
                        List.of(2),
                        List.of(),
                        List.of(1)
//                        List.of()
                )
        );


//        int[]
    boolean[] b1 = new boolean[1000];
    b1[0] = true;
    int count1 = rooms.size()-1;
        for (int count = 0; count < rooms.size() && count1 >= 0; count++,count1--) {
            if(b1[count]){
                for (int i = 0; i < rooms.get(count).size(); i++) {
                    b1[rooms.get(count).get(i)] = true;
                }
            }
            if (b1[count1]) {
                for (int i = 0; i < rooms.get(count).size(); i++) {
                    b1[rooms.get(count).get(i)] = true;
                }

            }else{
                System.out.println(false);
                return;
            }


        }



    }
    public static boolean isHave(boolean[] b1, int i){
        return b1[i];
    }
}
