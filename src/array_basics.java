import java.util.Scanner;

public class array_basics {
    static void main() {
        System.out.println("Enter target value: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+i+ " element of array");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == target){
                System.out.println("element " + target+ " found at "+ i+ " index");
            }else {
                //System.out.println(target+ " not found");
            }
        }
    }
}
