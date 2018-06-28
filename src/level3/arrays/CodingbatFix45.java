package level3.arrays;

import java.util.Arrays;

public class CodingbatFix45 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]{1, 4, 1, 5, 5, 4, 1})));
    }

    private static int[] fix34(int[] nums) {
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
