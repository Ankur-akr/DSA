public class checkPrime {
        public static void main(String[] args) {
            int n =47;
            int count=0;
            for (int i = 1; i <=n ; i++) {
                if(n%i==0){
                    count = count+1;
                }

            }
            if(count==2){
                System.out.println("prime num");
            }
            else {
                System.out.println("not a prime no.");
            }
        }


}
/*
public boolean isPrime(int n) {
        if (n <= 1) return false;

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
*/