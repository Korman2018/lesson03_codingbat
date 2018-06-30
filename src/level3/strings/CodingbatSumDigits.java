package level3.strings;

/**
 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all
 * other characters. Return 0 if there are no digits in the string.
 * (Note: Character.isDigit(char) tests if a char is one of the
 * chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 */
public class CodingbatSumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("dsf1kjkl23d"));
    }

    public static int sumDigits(String str) {
        String stringOfDigits = str.replaceAll("[^0-9]", "");

        int summ = 0;

        for (int i = 0; i < stringOfDigits.length(); i++) {
            summ += Integer.parseInt(stringOfDigits.substring(i, i + 1));
        }
        return summ;
    }
}
