package ASSIGNMENT2;

public class Que1 {

    public static int CountInversions(int[] a, int n) {
        if (n < 2) {
            return 0;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        int inversions = CountInversions(l, mid);
        inversions += CountInversions(r, n - mid);
        inversions += mergeAndCountSplitInversions(a, l, r, mid, n - mid);
        return inversions;
    }

    public static int mergeAndCountSplitInversions(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        int inversions = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
                inversions += left - i; // Count inversions
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }

        return inversions;
    }



    public static void main(String[] args) {
        int[] array = { 9, 8, 4, 5 };

        int inversions = Que1.CountInversions(array, array.length);

        System.out.println("\nNumber of inversions: " + inversions);
    }

}