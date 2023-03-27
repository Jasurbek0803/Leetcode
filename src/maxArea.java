public class maxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

//        int ans  = 0;
//        int start = 0 , end = h.length-1;
//        while(start != end){
//            if((h[end]*(end-start)) > ans && h[start] >= h[end] ){
//                ans = h[end]*(end-start);
//            }
//            else if((h[start]*(end-start)) > ans && h[start] <= h[end]){
//                ans = h[start]*(end-start);
//            }
//            if(h[start] >= h[end]){
//                end--;
//            }
//            else if(h[start] <= h[end]){
//                start++;
//            }
//        }

        int res = 0;
        for(int i = height.length-1; i >= 0; i--){
            int currMax = 0;
            for(int j = 0; j < height.length; j++){
                if(height[i] > height[j]){
                    currMax = Math.max(height[j] * (j-i), currMax);
                }else{
                    currMax = Math.max(height[i] * (j-i), currMax);
                }
            }
            res = Math.max(res, currMax);
        }

        System.out.println(res);
    }

}
