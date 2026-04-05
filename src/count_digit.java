import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int count =0;
        while(num>0){
            count = count+1;
            num=num/10;
        }
        System.out.println(count);
    }

}
