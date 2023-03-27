public class isPerfectSquare {
    public static void main(String[] args) {
        int num = 16;

        int minNum = 0;
        int maxNum = 46341;


        while(minNum < maxNum){
            if(Math.pow(minNum,2) == num){
                System.out.println(minNum);
                return;
            }
            minNum++;
        }

    }
}
