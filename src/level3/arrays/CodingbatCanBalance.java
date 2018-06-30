package level3.arrays;

/**
 * Given a non-empty array, return true if there is a place to split the array so
 * that the sum of the numbers on one side is equal to the sum of the numbers on
 * the other side.
 */
public class CodingbatCanBalance {
    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
    }

    public static boolean canBalance(int[] nums) {
        long sumRight = 0;
        long sumLeft = 0;

        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            sumLeft += nums[i];
            if (sumLeft == sumRight) {
                return true;
            }
            sumRight -= nums[i + 1];
        }
        return false;
    }
}
