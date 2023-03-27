public class distinctNames {
    public static void main(String[] args) {
        String[] ideas = {"coffee","donuts","time","toffee"};

        int count = 0;
        for (int i = 0; i < ideas.length; i++) {
            for (int j = 0; j < ideas.length; j++) {
                String str1 = ideas[i].charAt(0) + ideas[j].substring(1);

                String str2 = ideas[j].charAt(0) + ideas[i].substring(1);

                if(str1.equals(str2)){

                }
                else if (isHave(ideas, str1, str2)){
                    count++;
                }

            }

        }
        System.out.println(count);
    }
    public static boolean isHave(String[] ideas, String str1, String str2){
        if (str1.equals(str2)) return  false;
        for (int i = 0; i < ideas.length; i++) {
            if(ideas[i].equals(str1) || ideas[i].equals(str2)){
                return false;
            }
        }
        return true;
    }
}
