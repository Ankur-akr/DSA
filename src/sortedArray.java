public class sortedArray {
    static void main() {
        boolean isAscending = true;
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                isAscending =false;
            }
        }
        if (isAscending){
            System.out.println("ascending order");
        }
        else {
            System.out.println("not ascending");
        }
    }


}
