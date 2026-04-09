import java.util.ArrayList;

public class lc1480 {
    static void main() {
        int[] arr ={1,3,5,6,6};
        int sum = arr[0];
        ArrayList<Integer> al = new ArrayList<>();
        al.add(sum);
        for (int i = 1; i < arr.length; i++) {
            sum = arr[i]+sum;
            al.add(sum);
        }
        System.out.println(al);
    }
}
