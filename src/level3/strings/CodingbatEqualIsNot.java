package level3.strings;

/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string
 * is equal to the number of appearances of "not" anywhere in the string (case sensitive).
 */
public class CodingbatEqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notnot"));
    }

    public static boolean equalIsNot(String str) {
        int countIS = (str.length() - str.replaceAll("is", "").length()) / 2;
        int countNOT = (str.length() - str.replaceAll("not", "").length()) / 3;
        return countIS == countNOT;
    }
}
