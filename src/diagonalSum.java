public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        int count = 0;
        for (int i = mat.length-1; i >= 0; i--) {
            if(count != i){
                sum += mat[i][count++];
            }else count++;

        }

        System.out.println(sum);

    }
}
