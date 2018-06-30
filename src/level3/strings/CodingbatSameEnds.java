package level3.strings;

/**
 * Given a string, return the longest substring that appears at both the beginning and end
 * of the string without overlapping. For example, sameEnds("abXab") is "ab".
 */
public class CodingbatSameEnds {
    public static void main(String[] args) {

        System.out.println(sameEnds("asdfXasd"));
    }

    public static String sameEnds(String string) {
        int substringLength = 0;
        int stringLength = string.length();
        int center = stringLength / 2;
        for (int i = 0; i < center; i++) {
            if (string.regionMatches(0, string, stringLength - center + i, center - i)) {
                substringLength = center - i;
                break;
            }
        }
        return string.substring(0, substringLength);
    }
}
