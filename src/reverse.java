import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter number you want to reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev_num =0;
        while(num>0){
            int lastDigit = num%10;
            rev_num = rev_num*10 + lastDigit;
            num = num/10;
        }
        System.out.println(rev_num);
    }
}
