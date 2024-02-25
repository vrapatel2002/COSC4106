package ASSIGNMENT2;

import java.util.Arrays;

class MergeSor {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int L[], int R[]) {
        // Find sizes of two subarrays to be merged
        int i = 0, j = 0, k = 0;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[i];
                j++;
            }
            k++;
        }

        if (i == L.length) {
            System.arraycopy(arr, k, R, j, k);
            // System.array
        } else {
            System.arraycopy(arr, k, L, i, k);
        }

    }

    static void mergesort(int arr[]) {
        if (arr.length / 2 > (arr.length / 2) - arr.length) {

            int L[] = new int[arr.length / 2];
            int R[] = new int[arr.length - L.length];
            int M[] = new int[arr.length];

            L = Arrays.copyOfRange(arr, 0, L.length);
            R = Arrays.copyOfRange(arr, L.length, arr.length);

            mergesort(L);
            mergesort(R);

            merge(M, L, R);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.println("\nUnsorted array is");
        printArray(arr);

        mergesort(arr);
        System.out.println("\nSorted array is");
        printArray(arr);

    }
}
/* This code is contributed by Rajat Mishra */
