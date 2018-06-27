package level3.strings;

public class CodingbatSumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }

    private static int sumNumbers(String str) {
        int summ = 0;

        for (String s : str.toLowerCase().split("[^0-9]")) {
            summ += s.equals("") ? 0 : Integer.parseInt(s);
        }

        return summ;
    }
}
