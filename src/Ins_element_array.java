public class Ins_element_array {
    static void main(String[] args) {
        int[] arr = new int[5];
        //arr = {1,2,4,5};
        int item = 3;
        int pos = 2;
        int n = arr.length;
        int i = n;
        while (i>+pos){
            arr[i+1]=arr[i];
            i--;
        }
        arr[pos]=item;
        n=n+1;
    }
}
