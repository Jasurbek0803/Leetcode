public class countPoints {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        int count = 0;
        int res = 0;
        for (int i = 0; i <= 9; i++) {
            if(rings.contains('R' + String.valueOf(i))) count++;
            if(rings.contains('B' + String.valueOf(i))) count++;
            if(rings.contains('G' + String.valueOf(i))) count++;

            if(count == 3){
                res++;
            }
            count = 0;
        }
        System.out.println(res);
    }
}
