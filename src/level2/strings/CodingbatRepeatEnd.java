package level2.strings;

public class CodingbatRepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("QWwdCDqw", 2));
    }

    private static String repeatEnd(String str, int n) {
        if (str == null) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String substring = str.substring(str.length() > n ? str.length() - n : str.length(), str.length());

        for (int i = 0; i < n; i++) {
            stringBuilder.append(substring);
        }
        return stringBuilder.toString();
    }
}
