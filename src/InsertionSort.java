public class InsertionSort {
    static void main(String[] args) {
        int[] arr={1,5,70,2,61,61,9};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key =arr[i];
            int j = i-1;
            while(j>0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("largest element of the array is "+arr[n-1] );
    }
}
