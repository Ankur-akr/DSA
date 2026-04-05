import java.util.Scanner;

public class TwoSum {
    static void main(String[] args) {
        int[] arr={1,3,5,10,9,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum");
        int k = sc.nextInt();
        for(int i=0; i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k){
                    System.out.println("target sum index are : ["+i+"] [ "+j+"]");
                }

            }
        }

    }
}
