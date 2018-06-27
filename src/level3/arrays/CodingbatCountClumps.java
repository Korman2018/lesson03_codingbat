package level3.arrays;

public class CodingbatCountClumps {
    public static void main(String[] args) {

        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
    }

    private static int countClumps(int[] nums) {
        int generalCount = 0;
        for (int i = 0; i < nums.length; i++) {

            int tempValue = nums[i];
            int right = i + 1;
            boolean isMatchesFound = false;

            while (right < nums.length) {
                if (nums[right] == tempValue) {
                    isMatchesFound = true;
                } else {
                    break;
                }
                right++;
            }

            i = --right;

            if (isMatchesFound) {
                generalCount++;
            }
        }
        return generalCount;
    }
}
