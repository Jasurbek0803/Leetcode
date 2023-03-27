public class validMountainArray {
    public static void main(String[] args) {
        validMountainArray1(new int[]{1,3,2});
    }

    public static boolean validMountainArray1(int[] arr) {
        // int max = arr[0];
        int leftCount = 0;
        int rigthCount = 0;
        int curr = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                leftCount++;

            }else{
                if(arr[i] ==arr[i-1]){
                    return false;
                }
                curr = i-1;
                break;
            }
        }
        for(int i = curr; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                rigthCount++;
            }else{
                return false;
            }
        }
        return leftCount > 0 && rigthCount > 0;
    }
}
