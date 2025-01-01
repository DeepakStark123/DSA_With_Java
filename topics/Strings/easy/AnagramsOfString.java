
import java.util.Arrays;

class AnagramsOfString {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean res = anagramsOfString(str1, str2);
        if (res) {
            System.out.println(str1 + " And " + str2 + " is anagrams");
        } else {
            System.out.println(str1 + " And " + str2 + " is not anagrams");
        }
    }

    public static boolean anagramsOfString(String str1, String str2) {
        if (str1.length() != str1.length()) {
            return false;
        }
        // Convert the string to a character array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

/*
------Output------------

listen And silent is anagrams

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/
