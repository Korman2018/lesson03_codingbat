package level3.strings;

public class CodingbatCountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("wxxxTTTXXXXm"));
    }

    private static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            char currentSymbol = str.charAt(i);
            StringBuilder mathSting = new StringBuilder();
            mathSting.append(currentSymbol).append(currentSymbol).append(currentSymbol);

            if (str.regionMatches(i, mathSting.toString(), 0, 3)) {
                count++;
            }
        }
        return count;
    }
}
