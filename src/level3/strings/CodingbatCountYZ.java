package level3.strings;

public class CodingbatCountYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("y3bz  sadzz..asdfay"));
    }

    private static int countYZ(String str) {
        int count = 0;
        for (String s : str.toLowerCase().split("[\\W\\d]")) {
            if (s.endsWith("y") || s.endsWith("z")) {
                count++;
            }
        }
        return count;
    }

}
