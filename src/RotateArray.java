import java.util.Scanner;

public class RotateArray {
    static void main() {
        int [] arr = {1,2,56,3,5,6,9,4};
        System.out.println("Enter the value of k");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k = k%arr.length;
        for (int i = k; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
