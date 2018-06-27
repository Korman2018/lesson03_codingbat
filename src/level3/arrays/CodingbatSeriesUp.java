package level3.arrays;

import java.util.Arrays;

public class CodingbatSeriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(4)));
    }

    private static int[] seriesUp(int n) {
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
