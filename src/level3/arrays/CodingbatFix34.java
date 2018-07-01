package level3.arrays;

import java.util.Arrays;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4. Do not move
 * the 3's, but every other number may move. The array contains the same
 * number of 3's and 4's, every 3 has a number after it that is not a 3,
 * and a 3 appears in the array before any 4.
 */
public class CodingbatFix34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));
    }

    public static int[] fix34(int[] nums) {
        int nextIndexForFour = 0;
        int numsLength = nums.length;

        for (int i = 0; i < numsLength - 1; i++) {
            if (nums[i] != 3) {
                continue;
            }
            for (int j = nextIndexForFour; j < numsLength; j++) {
                if (nums[j] == 4) {
                    i++;
                    nextIndexForFour = j + 1;
                    nums[j] = nums[i];
                    nums[i] = 4;
                    break;
                }
            }
        }
        return nums;
    }
}
