package level3.strings;

public class CodingbatEqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is notnot"));
    }

    private static boolean equalIsNot(String str) {
        int countIS = (str.length() - str.replaceAll("is", "").length()) / 2;
        int countNOT = (str.length() - str.replaceAll("not", "").length()) / 3;
        return countIS == countNOT;
    }

}
