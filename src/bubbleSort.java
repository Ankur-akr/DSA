public class bubbleSort {
    static void main(String[] args) {
        int[] arr={1,5,70,2,61,61,9};
        int n = arr.length;
        bubbleSort bs = new bubbleSort();
        bs.BubbleSot(arr,n);

    }
    public void BubbleSot(int[] arr, int n){
        for(int i=0;i<n; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int swap =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=swap;
                }
            }
            System.out.print(arr[i]+ " ");
        }
    }

}
