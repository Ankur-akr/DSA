class KadaneWithIndex {

    public static void kadaneWithIndices(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Subarray Index Range = [" + start + ", " + end + "]");
    }

    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        kadaneWithIndices(arr);
    }
}
