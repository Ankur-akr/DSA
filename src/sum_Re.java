public class sum_Re {
    int sum (int n){
        if(n==1){
            return 1;
        }
        return (sum(n-1)+n) ;
    }

    static void main() {
        sum_Re obj = new sum_Re();
        int sum = obj.sum(10);
        System.out.println(sum);
    }
}
