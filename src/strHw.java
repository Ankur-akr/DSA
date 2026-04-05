import java.util.Scanner;

public class strHw {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string size");
        int size = sc.nextInt();
        String[] arr = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            arr[i] = sc.next();
            totLength += arr[i].length();
        }
        for(int i=0; i<size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(totLength);

    }


}
