public class reformatNumber {
    public static void main(String[] args) {
        String number = "123 4-567"; // CHALA

        int counter1 = 0;

        StringBuilder str = new StringBuilder("");
        StringBuilder res = new StringBuilder("");

        for (char ch: number.toCharArray()) {
            if(Character.isDigit(ch)){
                str.append(ch);
            }
        }
        int three = str.length() / 3;
        int two = (str.length() % 3) / 2;

        for (int i = 0; i <= str.length(); i++) {
            if(i != 0 && i % 3 == 0){
                res.append("-");
                res.append(str.substring(counter1,i));
                counter1 = i;

            }
        }

        int counter2 = counter1;
        for (int i = counter1; i < str.length(); i++) {
            if(i != 0 && i % 2 == 0){
                res.append(str.substring(counter2,i));
                counter2 = i;
                res.append("-");

            }
        }
        System.out.println(res);

    }
}
