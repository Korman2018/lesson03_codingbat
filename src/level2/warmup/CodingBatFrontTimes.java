package level2.warmup;

public class CodingBatFrontTimes {
    public static void main(String[] args) {

        System.out.println(frontTimes("Clasd:asd", 3));
    }

    private static String frontTimes(String str, int n) {
        if (str == null) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String substring = str.substring(0, str.length() > 3 ? 3 : str.length());

        for (int i = 0; i < n; i++) {
            stringBuilder.append(substring);
        }
        return stringBuilder.toString();
    }
}
