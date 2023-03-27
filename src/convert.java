public class convert {
    public static void main(String[] args) {
        String s = "ABC";
        int numRows = 1;
        if (numRows < 2) {
//            return s;
            System.out.println(s);
        return;
        }

        char[][] chars = new char[numRows][s.length()];
        StringBuilder str = new StringBuilder();
        int counter = 0;
        int i = 0;

        while (counter < s.length()){
            while( counter < s.length() && i < numRows){
                chars[i][counter] = s.charAt(counter);
                i++;
                counter++;
            }

            i--;

            while(counter < s.length() &&i > 0){
                i--;
                chars[i][counter] = s.charAt(counter);
                counter++;
            }
            i++;

        }

        for (int j = 0; j < chars.length; j++) {
            for (int k = 0; k < chars[j].length; k++) {
                if(chars[j][k] != '\u0000')
                    str.append(chars[j][k]);
            }
//            System.out.println();
        }

        System.out.println("PINALSIGYAHRPI");
        System.out.println(str);
//        System.out.println(chars[0][12]);


    }
}
