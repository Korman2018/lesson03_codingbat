package level3.strings;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
 * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter
 * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */
public class CodingbatCountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("y3bz  sadzz..asdfay"));
    }

    public static int countYZ(String str) {
        int count = 0;
        for (String s : str.toLowerCase().split("[\\W\\d]")) {
            if (s.endsWith("y") || s.endsWith("z")) {
                count++;
            }
        }
        return count;
    }
}
