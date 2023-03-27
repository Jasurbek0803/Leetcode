public class Recursive {
    public static void main(String[] args) {
        System.out.println(count7(7077));
        System.out.println(7 % 10);
    }
    public static int count7(int n)
    {
        if(n == 0)
            return 0;
        if(n % 10 == 7)
            return 1+count7(n/10);
        return count7(n/10);
    }

    public String changeXY(String str) {

        if(!(str.indexOf('x') > -1) ){
            return str;
        }else{
            if(str.indexOf('x') > -1){
                return changeXY(str.replaceFirst("x","y"));
            }
            return changeXY(str);
        }
    }
    public String allStar(String str) {
        int index = 0;
        if(index >= str.length()-1){
            return str;
        }else{
            return allStar(str.replaceFirst(str.charAt(index++)+"",str.charAt(index) + "*"));

        }
    }
}
