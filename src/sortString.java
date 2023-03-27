public class sortString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";

        int[] arr = new int[27];
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s.length();i++){
            int num = str.indexOf((s.charAt(i)));
//            num=num+1;
            arr[++num]=arr[num]+1;
        }
        int len = s.length();
        int count=0;
        StringBuilder ans = new StringBuilder();
        while(count<len){
            for(int i=1;i<27;i++){
                if(arr[i]>0){
                    ans.append(str.charAt(i - 1));
                    arr[i]=arr[i]-1;
                    count++;
                }
            }
            for(int j=26;j>=1;j--){
                if(arr[j]>0){
                    ans.append(str.charAt(j - 1));
                    arr[j]=arr[j]-1;
                    count++;
                }
            }
        }
        System.out.println(ans);
    }
}
