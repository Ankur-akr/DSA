import java.util.Scanner;

public class palindrome {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int reversedHalf = 0;

            while (x > reversedHalf) {
                reversedHalf = reversedHalf * 10 + x % 10;
                x /= 10;
            }

            return x == reversedHalf || x == reversedHalf / 10;
        }

    public static void main(String[] args) {
        palindrome obj = new palindrome();
        int a =56;
        if (obj.isPalindrome(a)==true){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    }




