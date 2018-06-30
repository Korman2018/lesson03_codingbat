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
        System.out.println(Arrays.toString(fix45(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }

    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                if (nums[i + 1] == 5) {
                    i++;
                    continue;
                }

                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] == 5 && j == 0) || nums[j] == 5 && nums[j - 1] != 4) {
                        i++;
                        nums[j] = nums[i];
                        nums[i] = 5;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
