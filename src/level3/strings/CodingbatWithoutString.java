package level3.strings;

/**
 * Given two strings, base and remove, return a version of the base string where all instances
 * of the remove string have been removed (not case sensitive). You may assume that the remove
 * string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing
 * "xx" leaves "x".
 */
public class CodingbatWithoutString {
    public static void main(String[] args) {
        String base = "xxXASDxxxFGxXxxHxx";
        String remove = "Xx";
        System.out.println(withoutString(base, remove));
    }

    public static String withoutString(String base, String remove) {
        StringBuilder stringBuilder = new StringBuilder(base);
        int removeLength = remove.length();
        int counter = 0;

        while (stringBuilder.length() - counter >= removeLength) {
            if (stringBuilder.toString().regionMatches(true, counter, remove, 0, removeLength)) {
                stringBuilder.delete(counter, counter + removeLength);
                counter--;
            }
            counter++;
        }
        return stringBuilder.toString();
    }
}