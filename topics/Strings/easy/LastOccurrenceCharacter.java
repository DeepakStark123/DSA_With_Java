
class LastOccurrenceCharacter {

    public static void main(String[] args) {
        // Input string and character
        String inputString = "banana";
        char targetChar = 'a';

        // Find the last occurrence of the character
        int lastIndex = lastOccurrenceCharacter(inputString, targetChar);

        // Output the result
        System.out.println("Input: \"" + inputString + "\", '" + targetChar + "'");
        System.out.println("Output: " + lastIndex);
    }

    public static int lastOccurrenceCharacter(String str, char ch) {
        // Character last = str.charAt(str.length()-1);
        int last = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                last = i;
            }
        }
        return last;
    }
}

/*
//-----------Explanation------------

Input Strings:
---------------
inputString: "banana"
targetChar: 'a'

Logic:
------
- Start iterating from the end of the string toward the beginning.
- If the target character is found, return its index immediately.
- If the loop completes without finding the character, return -1 to indicate the character is not present.

//------------Output------------

Input: "banana", 'a'
Output: 5

Input: "banana", 'x'
Output: -1

------Time-And-Space-Complexity------------
Time Complexity: O(n),  where n is the length of the string, as we may iterate through all characters in the worst case.
Space Complexity: O(1), as no additional data structures are used.

 */
