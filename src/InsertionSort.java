import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,12,12,1};
        sortInsertion(arr);

            System.out.println(Arrays.toString(arr));

    }

    public static void sortInsertion(int[] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int key = array[i];
            int x = i - 1;
            while ((x > -1) && (array[x] < key)){
                array[x+1] = array[x];
                x--;
            }
            array[x+1] = key;
        }
    }

}
