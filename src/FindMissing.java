public class FindMissing {
    static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5,7,8,10};
        int n= arr.length+1;
        int ExSum = (n*(n+1))/2;
        int acSum=0;
        for (int i = 0; i <arr.length; i++){
            acSum += arr[i];
        }
        int missingDigit = ExSum-acSum;
        System.out.println("Missing digit : "+missingDigit);
    }


}
