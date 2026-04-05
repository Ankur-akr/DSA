import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        int[] cards = {1,3,-4,-5,-6,2,-21};
        // --- Logic Section ---
        long currentTotalSum = 0;
        long currentNegChainSum = 0; // Sum of the current chain of negative numbers
        long minNegChainSum = 0;     // The 'smallest' (most negative) sum found so far

        for (int card : cards) {
            // 1. Always add to the total sum first (as if no flip happened yet)
            currentTotalSum += card;

            // 2. Identify chains of consecutive negative numbers
            if (card < 0) {
                // If card is negative, add to the current negative chain
                currentNegChainSum += card;
            } else {
                // If card is positive, the chain is broken.
                // Check if the chain we just finished was the "heaviest" negative chain so far.
                if (currentNegChainSum < minNegChainSum) {
                    minNegChainSum = currentNegChainSum;
                }
                // Reset the chain counter
                currentNegChainSum = 0;
            }
        }

        // 3. Edge Case: Check one last time if the array ended with a negative chain
        if (currentNegChainSum < minNegChainSum) {
            minNegChainSum = currentNegChainSum;
        }

        // --- Calculation ---
        // If we flip a sum of S (where S is negative), it becomes -S.
        // The difference added to the total is (-S) - S = -2S.
        // Since minNegChainSum is negative, subtracting 2 * minNegChainSum adds a positive value.
        long maxPossibleSum = currentTotalSum - (2 * minNegChainSum);

        System.out.println("Maximum Sum Possible: " + maxPossibleSum);


    }
}