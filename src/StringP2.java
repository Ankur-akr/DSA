public class StringP2 {
    static void main() {
        //Check Palindrome
        String a = "abcdba";
        int s = 0;
        int e = a.length() - 1;

        boolean isPalindrome = true;

        while (s < e) {
            if (a.charAt(s) != a.charAt(e)) {
                isPalindrome = false;
                break;
            }
            s++;
            e--;
        }

        System.out.println(isPalindrome);
        String b = "abcdcba";
        String rev = new StringBuilder(b).reverse().toString();

        System.out.println(b.equals(rev));
    }
}
