package level3.strings;

public class CodingbatMirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }

    private static String mirrorEnds(String string) {
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
