package ASSIGNMENT1;

import java.util.Arrays;
import java.util.Scanner;

public class knapsack {

    /*
     * 8, 4, 5
     * 0
     * 0, 8
     * 0, 8, 4, {8,4}
     * 0, 8, 4, {8,4}, 5, {8,5}, {8,5,6}, {4,5}
     */

    /**
     * @param array
     */

    private static int[] generateSubsets(int[] array, int[] subset, int index, int subsetSize) {
        if (index == array.length) {
            // Base case: reached the end of the array
            // printSubset(subset, subsetSize);
            int totalWeight = 0;
            for (int i = 0; i < subsetSize; i++) {
                totalWeight += subset[i];

            }
            return generateSubsets(array, subset, 0, 0);
        }

        // Include the current element and generate subsets
        subset[subsetSize] = array[index];
        generateSubsets(array, subset, index + 1, subsetSize + 1);

        // Exclude the current element and generate subsets
        generateSubsets(array, subset, index + 1, subsetSize);
    }

    private static int[] printSubset(int[] subset, int subsetSize) {
        int[] array = new int[(int) Math.pow(2, subset.length)];
        int totalWeight = 0;
        for (int i = 0; i < subsetSize; i++) {
            totalWeight += subset[i];

        }
        return array;
        // System.out.print(totalWeight + ", ");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of items: ");
        int items = scan.nextInt();

        System.out.println("Please enter the weight of each item: ");
        int[] weight = new int[items];
        for (int i = 0; i < weight.length; i++) {
        weight[i] = scan.nextInt();
        }

        System.out.println("Please enter the value of each item: ");
        int[] value = new int[items];
        for (int i = 0; i < value.length; i++) {
        value[i] = scan.nextInt();
        }

        System.out.println("What is the capacity of your knapsack? ");
        int capacity = scan.nextInt();
        // System.out.println(Arrays.toString(subset));

        // Arrays.toString(weightsubset(weight));

        System.out.println("The total value of each subset: ");
        int[] subset1 = new int[value.length]; // Array to store the current subset
        generateSubsets(value, subset1, 0, 0);
        // System.out.println(Arrays.toString(subset1));

        System.out.println("The largest value that fits into the knapsack is ");
        // Arrays.max(subset1);

    }

}
