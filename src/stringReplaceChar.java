import java.util.Scanner;

public class stringReplaceChar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String input = sc.nextLine();
        System.out.println("which letter you want to replace");
        String ch = sc.next();
        System.out.println("what letter should replace");
        String r = sc.next();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==ch.charAt(0)){
                result += r;
            }
            else {
                result += input.charAt(i);
            }
        }
        System.out.println(result);

    }
}
