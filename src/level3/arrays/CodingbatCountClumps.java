package level3.arrays;

/**
 * Say that a "clump" in an array is a series of 2 or more adjacent elements
 * of the same value. Return the number of clumps in the given array.
 */
public class CodingbatCountClumps {
    public static void main(String[] args) {

        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4, 2}));
    }

    public static int countClumps(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int numberOfClumps = 0;
        boolean isMatchesFound = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                isMatchesFound = true;
                continue;
            }

            if (isMatchesFound) {
                numberOfClumps++;
                isMatchesFound = false;
            }
        }

        if (isMatchesFound) {
            numberOfClumps++;
        }

        return numberOfClumps;
    }
}
