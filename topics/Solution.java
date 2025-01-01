
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean res = fun(str1, str2);
        System.out.println("Reverse String => " + res);
    }

    public static boolean fun(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        var character1 = str1.toCharArray();
        var character2 = str1.toCharArray();

        Arrays.sort(character1);
        Arrays.sort(character2);

        return Arrays.equals(character1, character2);
    }
}
