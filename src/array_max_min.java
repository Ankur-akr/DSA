import java.util.Arrays;

public class array_max_min {
    static void main() {
        int[] arr ={1,6,8,33,52};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        //System.out.println(Arrays.stream(arr).max());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>min){
                min = arr[i];
            }
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}
