package ASSIGNMENT1;

import java.util.Scanner;

public class KnapsackBruteForce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of items
        System.out.print("Please enter the number of items: ");
        int n = scanner.nextInt();

        // Input the weights of each item
        System.out.print("Please enter the weight of each item: ");
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        // Input the values of each item
        System.out.print("Please enter the value of each item: ");
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        // Input the capacity of the knapsack
        System.out.print("What is the capacity of your knapsack? ");
        int capacity = scanner.nextInt();

        scanner.close();

        // Generate the power set and find the largest value that fits into the knapsack
        int largestValue = findLargestValue(weights, values, capacity);

        // Output the result
        System.out.println("\nThe largest value that fits into the knapsack is " + largestValue + ".");
    }

    // Function to generate the power set and find the largest value that fits into the knapsack
    private static int findLargestValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int largestValue = 0;

        // Generate the power set using binary counting
        for (int i = 0; i < (1 << n); i++) {
            int totalWeight = 0;
            int totalValue = 0;

            // Check each bit in the binary representation
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    totalWeight += weights[j];
                    totalValue += values[j];
                }
            }

            // Check if the total weight is within the knapsack capacity
            if (totalWeight <= capacity) {
                // Update the largest value
                largestValue = Math.max(largestValue, totalValue);

                // Output the weight and value of the current subset
                System.out.println("The total weight of each subset: " + totalWeight);
                System.out.println("The total value of each subset:  " + totalValue);
            }
        }

        return largestValue;
    }
}
