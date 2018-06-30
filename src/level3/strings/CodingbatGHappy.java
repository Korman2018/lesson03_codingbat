package level3.strings;

/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately
 * to its left or right. Return true if all the g's in the given string are happy.
 */
public class CodingbatGHappy {
    public static void main(String[] args) {
        System.out.println(gHappy("xxggy  ygggxx"));
    }

    public static boolean gHappy(String str) {
        for (String s : str.toLowerCase().split("[^g]")) {
            System.out.println(s);
            if (s.length() == 1) {
                return false;
            }
        }
        return true;
    }
}
