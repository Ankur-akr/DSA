public class RemoveDuplicates {
    static void main() {
        int[] arr={1,1,2,2,3,4,5,5,5,6,6,7};
        int n = arr.length;
        int i =0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        for (int j = 0; j < i+1; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
