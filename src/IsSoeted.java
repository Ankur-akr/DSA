class isSorted {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5};
        isSorted a = new isSorted();
        System.out.println(a.checkSorted(arr));

    }
    public boolean checkSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
