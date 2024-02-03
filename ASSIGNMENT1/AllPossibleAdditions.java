package ASSIGNMENT1;

public class AllPossibleAdditions {
    public static void main(String[] args) {
        int[] array = { 8, 4, 5 };
        int[] subset = new int[8];
        int count = 1;
        int num=0;

        /*
         * 8, 4, 5
         * 0
         * 0, 8
         * 0, 8, 4, {8,4}
         * 0, 8, 4, {8,4}, 5, {8,5}, {8,5,6}, {4,5}
         */
        // generateSubset.add();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                num += array[j];
                subset[count]=num;
                count++;
            }
        }

        /*
         * 8 + 4
         * 8 + 5
         * 4 + 5
         * 8 + 4 + 5
         * 8
         * 5
         * 4
         * 12
         * 13
         * 9
         */
    }
}
