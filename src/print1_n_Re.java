class Solution {

    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    static void main() {
        int n = 5;
        printNumbers(n);
    }
}
