public class SecondLargestElement {
    static void main(String[] args) {
        int[] arr ={5,90,1,6,7,6,81,62,63,65};
        int max = arr[0];
        int n = arr.length;
        int secondLargest = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>secondLargest && arr[i]<max){
                secondLargest = arr[i];
            }
        }

        System.out.println("second largest element is "+ secondLargest);
        }
    }

