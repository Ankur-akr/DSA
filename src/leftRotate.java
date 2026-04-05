void main() {
    //left rotate by one place
    int [] arr = {1,5,3,56,30};
    System.out.println("enter value of k");
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = arr[0];
    int n = arr.length-1;
    for (int j = 0; j <k ; j++) {
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n]=a;

    }

    for (int i = 0; i < n+1; i++) {
        System.out.println(arr[i]);
    }
}