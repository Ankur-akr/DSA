void main() {
    int [] a1 = {1,2,3,4,5};
    int [] a2 = {2,3,40,7};
    Set<Integer> union = new HashSet<>();
    for(int i:a1){
        union.add(i);
    }
    for (int j : a2){
        union.add(j);
    }
    System.out.println(union);

}
