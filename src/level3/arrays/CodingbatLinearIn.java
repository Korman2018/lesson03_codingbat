package level3.arrays;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner, return true
 * if all of the numbers in inner appear in outer. The best solution makes only a
 * single "linear" pass of both arrays, taking advantage of the fact that both arrays
 * are already in sorted order.
 */
public class CodingbatLinearIn {
    public static void main(String[] args) {
        System.out.println(linearIn(new int[]{2, 2, 2, 2}, new int[]{2, 4}));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int leftIndex = 0;
        for (int anInner : inner) {
            boolean isIncluded = false;

            for (int j = leftIndex; j < outer.length; j++) {
                if (outer[j] < anInner) {
                    continue;
                }
                if (outer[j] == anInner) {
                    isIncluded = true;
                    leftIndex = j + 1;
                    break;
                }
                return false;
            }
            if (!isIncluded) {
                return false;
            }
        }
        return true;
    }
}
