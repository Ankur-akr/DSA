void main() {
    //Longest Subarray with given Sum K(Positives)
    //int[] arr = {1,4,5,44,3,2,4,1,5};
    int[] arr = {1,-1,5,-5,6};
    int k = 0;
    int i =0;
    int j = 0;
    int res =0;
    int sum = arr[0];
    int n = arr.length;
    while(j<n){
        while(i<=j && sum >k){
            sum-=arr[i];
            i++;
        }
        if(sum==k){
            res = Math.max(res,j-i+1);
        }
        j++;
        if(j<n) sum+=arr[j];
    }
    System.out.println(res);

}