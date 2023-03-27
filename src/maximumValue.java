public class maximumValue {
    public static void main(String[] args) {
        String[] strs = {"1","01","001","0001"};

        int max = -1;
        int n = 0;
        int count = 0;
        for(String str : strs){
            for (int i = 0; i < str.length(); i++) {
                if(Character.isAlphabetic(str.charAt(i))){
                    max = Math.max(max,str.length());
                    break;
                }else if(Character.isDigit(str.charAt(i))){
                    count++;
                }
            }
            if(count == str.length()){
                n = Integer.parseInt(String.valueOf(str));
                max = Math.max(max,n);
            }
            n = 0;
            count = 0;

        }
        System.out.println(max);

    }
}
