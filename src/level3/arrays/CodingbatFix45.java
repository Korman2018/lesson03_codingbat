package level3.arrays;

import java.util.Arrays;

/**
 * (This is a slightly harder version of the fix34 problem.) Return an array that
 * contains exactly the same numbers as the given array, but rearranged so that
 * every 4 is immediately followed by a 5. Do not move the 4's, but every other
 * number may move. The array contains the same number of 4's and 5's, and every 4
 * has a number after it that is not a 4. In this version, 5's may appear anywhere
 * in the original array.
 */
public class CodingbatFix45 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 5, 4, 1})));
    }

    public static int[] fix45(int[] nums) {
        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++) {
            for (int j = 0; j < numsLength - 1; j++) {
                if (nums[j] == 4 && nums[i] == 5) {
                    j++;
                    nums[i] = nums[j];
                    nums[j] = 5;
                }
            }
        }
        return nums;
    }
}
