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
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 3, 2, 4, 4})));
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i + 1] == 4) {
                    i++;
                    continue;
                }

                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] == 4 && j == 0) || nums[j] == 4 && nums[j - 1] != 3) {
                        i++;
                        nums[j] = nums[i];
                        nums[i] = 4;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
