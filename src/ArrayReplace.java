//Array reversing without using extra space

void main() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(14);
    arr.add(10);
    int n = arr.size();
    /*for (int i = 0; i < n; i++) {
        arr.add(i, arr.get(n - 1));
        arr.removeLast();

    }
    System.out.println(arr);*/
    int j = n-1;
    int i = 0;
    while (i<j){
        int temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        i++;
        j--;

    }
    System.out.println(arr);

}
