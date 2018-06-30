package level3.arrays;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two inclusive.
 * A single value has a span of 1. Returns the largest span found in the given array.
 * (Efficiency is not a priority.)
 */
public class CodingbatMaxSpan {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        System.out.println(maxSpan(new int[]{3, 9}));
    }

    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSpan = 1;
        for (int i = 0; i < nums.length; i++) {
            int curElement = nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] == curElement) {
                    int curSpan = j - i + 1;
                    if (curSpan > maxSpan) {
                        maxSpan = curSpan;
                    }
                    break;
                }
            }
            if (maxSpan > nums.length - i) {
                return maxSpan;
            }
        }
        return maxSpan;
    }
}
