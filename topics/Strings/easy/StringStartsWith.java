
class StringStartsWith {

    public static void main(String[] args) {
        // Input strings
        String mainString = "hello";
        String subString = "h";

        // Check if the main string starts with the substring
        boolean result = startsWith(mainString, subString);

        // Output the result
        System.out.println("Input: \"" + mainString + "\", \"" + subString + "\"");
        System.out.println("Output: " + result);
    }

    public static boolean startsWith(String mainString, String subString) {
        // If the length of the substring is greater than the main string, return false
        if (subString.length() > mainString.length()) {
            return false;
        }

        // Compare characters of the substring with the main string
        for (int i = 0; i < subString.length(); i++) {
            if (mainString.charAt(i) != subString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

/*
//-----------Explanation------------

Input Strings:
---------------
mainString: "hello"
subString: "he"

Logic:
------
First, check if the subString is longer than the mainString. If yes, return false.
Compare each character of subString with the corresponding character of mainString.
If all characters match, return true. Otherwise, return false.

//------------Output------------

Input: "hello", "he"
Output: true

Input: "hello", "hi"
Output: false

------Time-And-Space-Complexity------------
Time Complexity: O(m), where m is the length of the subString.
Space Complexity: O(1), as no additional data structures are used.

 */
