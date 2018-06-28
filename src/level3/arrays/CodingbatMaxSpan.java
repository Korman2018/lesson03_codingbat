package level3.arrays;

public class CodingbatMaxSpan {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        System.out.println(maxSpan(new int[]{3, 9}));
    }

    private static int maxSpan(int[] nums) {
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
                        if (maxSpan > nums.length - i) {
                            return maxSpan;
                        }
                    }
                    break;
                }
            }
        }
        return maxSpan;
    }
}
