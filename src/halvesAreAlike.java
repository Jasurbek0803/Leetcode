public class halvesAreAlike {
    public static void main(String[] args) {
        String s = "Mexanizm";
        String a = s.substring(0,s.length() / 2 );
        String b = s.substring(s.length() / 2);
        System.out.println(a);
        System.out.println(b);

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a') count++;
            else if(a.charAt(i) == 'e') count++;
            else if(a.charAt(i) == 'i') count++;
            else if(a.charAt(i) == 'o') count++;
            else if(a.charAt(i) == 'u') count++;
            else if(a.charAt(i) == 'A') count++;
            else if(a.charAt(i) == 'E') count++;
            else if(a.charAt(i) == 'I') count++;
            else if(a.charAt(i) == 'O') count++;
            else if(a.charAt(i) == 'U') count++;
        }
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == 'a') count--;
            else if(b.charAt(i) == 'e') count--;
            else if(b.charAt(i) == 'i') count--;
            else if(b.charAt(i) == 'o') count--;
            else if(b.charAt(i) == 'u') count--;
            else if(b.charAt(i) == 'A') count--;
            else if(b.charAt(i) == 'E') count--;
            else if(b.charAt(i) == 'I') count--;
            else if(b.charAt(i) == 'O') count--;
            else if(b.charAt(i) == 'U') count--;
        }



    }
}
