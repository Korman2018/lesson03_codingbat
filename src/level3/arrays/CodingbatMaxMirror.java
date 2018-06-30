package level3.arrays;

/**
 * We'll say that a "mirror" section in an array is a group of contiguous elements
 * such that somewhere in the array, the same group appears in reverse order.
 * For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3
 * (the {1, 2, 3} part). Return the size of the largest mirror section found in the
 * given array.
 */
public class CodingbatMaxMirror {
    public static void main(String[] args) {

        System.out.println(maxMirror(new int[]{1, 2, 1, 3, 1, 2, 1, 1}));
    }

    public static int maxMirror(int[] nums) {
        int generalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {

                int left = i;
                int right = j;
                int tempCount = 0;

                while (left < nums.length && right >= 0) {
                    if (nums[left] == nums[right]) {
                        tempCount++;
                        left++;
                        right--;
                    } else {
                        break;
                    }
                }

                if (generalCount < tempCount) {
                    generalCount = tempCount;
                }
            }
        }
        return generalCount;
    }
}
