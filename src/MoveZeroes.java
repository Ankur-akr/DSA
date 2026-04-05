import java.util.Arrays;

public class MoveZeroes {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 2, 0, 0, 5, 6, 0, 60};
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}