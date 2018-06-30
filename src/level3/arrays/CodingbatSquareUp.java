package level3.arrays;

import java.util.Arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern,
 * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces
 * added to show the 3 groups).
 */
public class CodingbatSquareUp {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(squareUp(4)));
    }

    public static int[] squareUp(int n) {
        int[] array = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                array[i * n - j] = j;
            }
        }
        return array;
    }
}
