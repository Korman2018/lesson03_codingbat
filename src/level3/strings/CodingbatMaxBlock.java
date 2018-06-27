package level3.strings;

public class CodingbatMaxBlock {
    public static void main(String[] args) {
        System.out.println(maxBlock("abbCCCddBBBxx"));
    }

    private static int maxBlock(String str) {
        int maxCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int j = i + 1;
            char tempChar = str.charAt(i);
            int tempCount = 1;
            while (j < str.length()) {
                if (tempChar == str.charAt(j)) {
                    tempCount++;
                    j++;
                } else {
                    break;
                }
            }
            if (tempCount > maxCount) {
                maxCount = tempCount;
            }
        }
        return maxCount;
    }
}
