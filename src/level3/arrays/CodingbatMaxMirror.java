package level3.arrays;

public class CodingbatMaxMirror {
    public static void main(String[] args) {

        System.out.println(maxMirror(new int[]{1, 2, 1, 3, 1, 2, 1, 1}));
    }

    private static int maxMirror(int[] nums) {
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
