package ASSIGNMENT1;

import java.util.Arrays;
import java.util.Scanner;

public class knapsack {

    public static int[] weightsubset(int[] array) {

        int range = (int) Math.pow(2, array.length);

        int[] weightarray = Arrays.copyOf(array, range);

        int count = array.length;

        for (int i = 0; i < array.length; i++) {

            weightarray[count] = array[i];

            count++;
            
            for (int j = i + 1; j < array.length - 1; j++) {

                weightarray[count] = array[i] + array[j];
                count++;

            }
        }

        return weightarray;

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

        System.out.println("The total weight of each subset: ");

        Arrays.toString(weightsubset(weight));

        System.out.println("The total value of each subset: ");

        System.out.println("The largest value that fits into the knapsack is ");

    }

}
