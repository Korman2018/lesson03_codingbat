package level3.arrays;

import java.util.Arrays;

public class CodingbatSquareUp {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareUp(4)));
    }

    private static int[] squareUp(int n) {
        int[] array = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                array[i * n - j] = j;
            }
        }
        return array;
    }
}
