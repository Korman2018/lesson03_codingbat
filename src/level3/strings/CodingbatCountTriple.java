package level3.strings;

/**
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string. The triples may overlap.
 */
public class CodingbatCountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("wxxxTTTXXXXm"));
    }

    public static int countTriple(String str) {
        int matchesCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char currentSymbol = str.charAt(i);
            StringBuilder mathSting = new StringBuilder();
            mathSting.append(currentSymbol).append(currentSymbol).append(currentSymbol);

            if (str.regionMatches(i, mathSting.toString(), 0, 3)) {
                matchesCount++;
            }
        }
        return matchesCount;
    }
}
