package level3.strings;

/**
 * Given a string, look for a mirror image (backwards) string at both the beginning and end
 * of the given string. In other words, zero or more characters at the very begining of the
 * given string, and at the very end of the string in reverse order (possibly overlapping).
 * For example, the string "abXYZba" has the mirror end "ab".
 */
public class CodingbatMirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }

    public static String mirrorEnds(String string) {
        StringBuilder findSubstring = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == string.charAt(string.length() - 1 - i)) {
                findSubstring.append(currentChar);
            } else {
                break;
            }
        }
        return findSubstring.toString();
    }
}
