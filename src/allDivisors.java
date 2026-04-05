public class allDivisors {
    public static void main(String[] args) {
        int n =53;
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.println(i);
                count = count+1;
            }

        }
        System.out.println("no. of divisors " +count);
    }
}
