package ASSIGNMENT2;

import java.util.Arrays;

public class Que2 {

    public static void solve(int[] A, int[] B, int S) {

        Arrays.sort(B);

        // A = { 8, 3, 4, 7 }
        // B = { 1, 5, 6, 12}
        // 4 + 6 = 10

        for (int i = 0; i < A.length; i++) {

            int find = S - A[i];
            if (Arrays.binarySearch(B, find) > 0) {

                System.out.println(A[i] + " + " + B[Arrays.binarySearch(B, find)] + " = " + S);
                break;
            }
            
            if (i == A.length - 1) {
                System.out.println("No two integers from A and B add up to " + S);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = { 8, 3, 4, 7 };
        int[] B = { 5, 6, 12, 1 };
        int S = 10;

        solve(A, B, S);

        int[] C = { 1, 5, 4, 2 };
        int[] D = { 6, 3, 2, 1 };
        int S1 = 9;

        solve(C, D, S1);

    }

}