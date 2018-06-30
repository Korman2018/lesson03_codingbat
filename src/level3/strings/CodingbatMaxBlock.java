package level3.strings;

/**
 * Given a string, return the length of the largest "block" in the string.
 * A block is a run of adjacent chars that are the same.
 */
public class CodingbatMaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    public static int maxBlock(String str) {
        if (str.equals("")) {
            return 0;
        }

        int maxCount = 0;
        int tempCount = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                tempCount++;
            } else {
                tempCount = 1;
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }
        return maxCount;
    }
}
