package ASSIGNMENT1;

import java.util.Scanner;

/**
 * Substring
 */

public class Substring {

    public static int subStringfinder(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                String substr = str.substring(i, j);
                if (str.substring(i, j).endsWith("B") & str.substring(i, j).startsWith("A")) {
                    count++;
                }
                // substrings.add(str.substring(i, j));
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String str = scan.next().toUpperCase();

        System.out.println("The number of substrings that start with an A and end with a B is " + subStringfinder(str));

    }
}