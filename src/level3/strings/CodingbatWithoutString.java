package level3.strings;

public class CodingbatWithoutString {
    public static void main(String[] args) {

        String base = "xxXASDxxxFGxXxxHxx";
        String remove = "Xx";
        System.out.println(withoutString(base, remove));
    }

    private static String withoutString(String base, String remove) {
        StringBuilder stringBuilder = new StringBuilder(base);
        int i = 0;

        while (stringBuilder.length() - i >= remove.length()) {
            if (stringBuilder.toString().regionMatches(true, i, remove, 0, remove.length())) {

                stringBuilder.delete(i, i + remove.length());
                i--;
            }
            i++;
        }
        return stringBuilder.toString();
    }
}