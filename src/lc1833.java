import java.util.Arrays;

public class lc1833 {
    static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4, 2};
        int k = 6;
        int sum = 0;
        int c = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (sum < k) {
                sum = sum + arr[i];
                c++;
            }
            System.out.println(c);
        }
    }
}
