package level3.strings;

/**
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 * A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if
 * a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 */
public class CodingbatSumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }

    public static int sumNumbers(String str) {
        int summ = 0;

        for (String s : str.toLowerCase().split("[^0-9]")) {
            summ += s.equals("") ? 0 : Integer.parseInt(s);
        }
        return summ;
    }
}
