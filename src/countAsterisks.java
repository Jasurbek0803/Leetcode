public class countAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";

        int count = 1;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*'){
                count1++;
            }
            if(count % 2 != 0){
                for (int j = 0; j < s.indexOf("|"); j++) {
                    if(s.charAt(j) == '*'){
                        count1++;
                    }
                }
            }
            int n = s.indexOf('|');
            s = s.substring(n+1);
            count++;
        }
        System.out.println(count1);


    }
}
