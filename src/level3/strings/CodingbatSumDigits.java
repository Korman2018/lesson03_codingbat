package level3.strings;

public class CodingbatSumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits("dsf1kjkl23d"));

    }

    private static int sumDigits(String str) {
        String string = str.replaceAll("[^0-9]", "");

        int summ = 0;

        for (int i = 0; i < string.length(); i++) {
            summ += Integer.parseInt(string.substring(i, i + 1));
        }
        return summ;
    }
}
