public class factorial {
   public int fact(int n ){
       if(n==0||n==1){
           return 1;
       }
       return (fact(n-1)*n);
    }

    static void main() {
        factorial obj = new factorial();
        int f= obj.fact(5);
        System.out.println(f);
    }
}

