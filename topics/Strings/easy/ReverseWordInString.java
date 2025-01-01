
class ReverseWordInString {

    public static void main(String[] args) {
        // Input string and character
        String inputString = "hello world";

        // Find the last occurrence of the character
        String lastIndex = reverseWordInString(inputString);

        // Output the result
        System.out.println("Input: " + inputString);
        System.out.println("Output: " + lastIndex);
    }

    public static String reverseWordInString(String str) {
        // split string from space
        String[] words = str.split(" ");

        // Use a StringBuilder to construct the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add a space between words
            }
        }

        return reversed.toString();
    }
}

/*
//-----------Explanation------------

Input Strings:
---------------
"hello world"

Split into Words:
---------------
Use split(" ") to split the string into an array of words: ["hello", "world"].

Logic:
------
- Iterate through the array from the last word to the first.
- Append each word to a StringBuilder with a space between words.

//------------Output------------

Input: "hello world"
Output: "world hello"

Input: "the sky is blue"
Output: "blue is sky the"

------Time-And-Space-Complexity------------
Time Complexity: O(n), 
Space Complexity: O(n), for the array of words created by split.

 */
