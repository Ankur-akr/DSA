public class SingleNumber {
    static void main(String[] args) {
        int[] arr={1,2,2,1,3,4,4};
        int result=0;
        for(int nums:arr){
            result ^= nums;
        }
        System.out.println("single number: "+result);
    }
}
