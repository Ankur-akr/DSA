void main() {
    int [] arr = {1,1,2,3,4,4,4,5};
    int n = arr.length;
    int i = 0;
    for (int j = 1; j < n; j++) {
        if (arr[i] != arr[j]){
            i++;
            arr[i]= arr[j];
        }
    }
    System.out.println(i+1);
}