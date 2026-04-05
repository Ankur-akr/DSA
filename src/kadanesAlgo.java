class KadaneAlgorithm {

    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Either extend the previous subarray or start new
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,-9,4,-3,7,9,-1};

        System.out.println("Maximum Subarray Sum = " + maxSubArray(arr));
    }
}
