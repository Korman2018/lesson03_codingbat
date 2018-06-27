package level3.strings;

public class CodingbatGHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggy  ygggxx"));
    }

    private static boolean gHappy(String str) {
        for (String s : str.toLowerCase().split("[^g]")) {
            if (s.length() == 1) {
                return false;
            }
        }
        return true;
    }
}
