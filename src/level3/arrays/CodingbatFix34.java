package level3.arrays;

import java.util.Arrays;

public class CodingbatFix34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 3, 2, 4, 4})));
    }

    private static int[] fix34(int[] nums) {
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
