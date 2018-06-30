package level3.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, return a string where every appearance of the lowercase word "is" has been
 * replaced with "is not". The word "is" should not be immediately preceeded or followed by
 * a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
 * tests if a char is a letter.)
 */
public class CodingbatNotReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is-is"));
    }

    public static String notReplace(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                boolean isLeftOK = i == 0 || !Character.isLetter(str.charAt(i - 1));
                boolean isRightOK = i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2));
                if (isLeftOK && isRightOK) {
                    list.add(i + 2);
                }
            }
        }

        for (int j = list.size() - 1; j >= 0; j--) {
            stringBuilder.insert(list.get(j), " not");
        }
        return stringBuilder.toString();
    }
}
