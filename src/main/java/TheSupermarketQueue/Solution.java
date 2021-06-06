package TheSupermarketQueue;

import java.util.Arrays;

public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] customersInTills = Arrays.copyOfRange(customers, 0, n);

        for (int j = n; j < customers.length; j++) {
            int smallest = findSmallestAndReturnIndex(customersInTills);
            customersInTills[smallest] = customersInTills[smallest] + customers[j];
        }
        return findSmallestAndReturnNumber(customersInTills);
    }

    private static int findSmallestAndReturnIndex(int[] customers) {
        int minIndex = 0;

        for (int i = 1; i < customers.length; i++) {
            if (customers[i] < customers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int findSmallestAndReturnNumber(int[] customers) {
        int maxNumber = customers[0];

        for (int i = 1; i < customers.length; i++) {
            if (customers[i] > maxNumber) {
                maxNumber = customers[i];
            }
        }
        return maxNumber;
    }
}