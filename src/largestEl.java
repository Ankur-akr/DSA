void main() {
    int[] arr = {10,77,88,928,4};
    int n = arr.length;
    int max = arr[0];
    int Smax = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
        if(arr[i]>max){
            max = arr[i];
        }
    }
    for (int i = 0; i < n; i++) {
        if (arr[i]>Smax && arr[i]<max){
            Smax = arr[i];
        }
    }
    System.out.println(max);
    System.out.println(Smax);
}