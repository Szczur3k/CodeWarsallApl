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

class Runner {
    public static void main(String[] args) {
        int[] customers = {7, 3, 4, 1, 3, 2, 3, 2, 7, 6, 5, 7, 4, 6, 4, 5, 5, 2, 1};
        int tilts = 5;

        int[] customers2 = {2, 2, 3, 3, 4, 4};
        int tilts2 = 2;

        int[] customers3 = {7, 3, 5, 6, 6, 7, 2, 7, 2, 3};
        int tilts3 = 6;

        int[] customers4 = {4, 3, 4, 2, 3, 3, 4, 4, 5, 7, 5, 6, 6, 4, 2, 7};
        int tilts4 = 4;

        System.out.println(Solution.solveSuperMarketQueue(customers, tilts));
//        System.out.println(Solution.solveSuperMarketQueue(customers2, tilts2));
//        System.out.println(Solution.solveSuperMarketQueue(customers3, tilts3));
//        System.out.println(Solution.solveSuperMarketQueue(customers4, tilts4));
    }
}
