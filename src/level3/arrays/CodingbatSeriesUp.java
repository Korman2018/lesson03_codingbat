package level3.arrays;

import java.util.Arrays;

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
 * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
 * which is known to sum to exactly n*(n + 1)/2.
 */
public class CodingbatSeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }

    public static int[] seriesUp(int n) {
        int arraySize = n * (n + 1) / 2;
        int[] array = new int[arraySize];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                array[index++] = j + 1;
            }
        }
        return array;
    }
}
