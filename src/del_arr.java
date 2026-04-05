public class del_arr {
    static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int item = arr[2];
        //int pos = 2;
        int n = arr.length;
        int i = n;
        while (i<= n-1){
            arr[i]=arr[i+1];
            i++;
        }

        n=n-1;
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
