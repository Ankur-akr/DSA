import java.util.Scanner;

public class reverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println("Reversed String : ");
        System.out.println(sb);
        String input1 = "hello";
        String reversed = new StringBuilder(input1).reverse().toString();
        System.out.println(reversed);

    }
}
