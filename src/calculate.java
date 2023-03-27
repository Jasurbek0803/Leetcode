public class calculate {
    public static void main(String[] args) {
        String s = "";

//        if (s == null || s.isEmpty()) return;
//
//        int length = s.length();
//        int currentNumber = 0, lastNumber = 0, result = 0;
//        char operation = '+';
//        for (int i = 0; i < length; i++) {
//            char currentChar = s.charAt(i);
//            if (Character.isDigit(currentChar)) {
//                currentNumber = (currentNumber * 10) + (currentChar - '0');
//            }
//            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
//                if (operation == '+' || operation == '-') {
//                    result += lastNumber;
//                    lastNumber = (operation == '+') ? currentNumber : -currentNumber;
//                } else if (operation == '*') {
//                    lastNumber = lastNumber * currentNumber;
//                } else if (operation == '/') {
//                    lastNumber = lastNumber / currentNumber;
//                }
//                operation = currentChar;
//                currentNumber = 0;
//            }
//        }
//        result += lastNumber;
//        System.out.println(result);

        if(s == null || s.isEmpty()) return;

        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if(Character.isDigit(currentChar)){
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == s.length() - 1){
                if(operation == '+' || operation == '-'){
                    result += lastNumber;
                    lastNumber = operation == '+' ? currentNumber : -currentNumber;

                } else if (operation == '*') {
                    lastNumber *= currentNumber;
                } else if (operation == '/') {
                    lastNumber /= currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;

            }

        }
        result += lastNumber;
        System.out.println(result);
    }
}
