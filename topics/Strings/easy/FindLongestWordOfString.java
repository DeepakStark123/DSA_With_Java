
class FindLongestWordOfString {

    public static void main(String[] args) {
        // Input string
        String input = "I love programming";

        // Check if the string contains only alphabets
        String result = findLongestWordOfString(input);

        // Output the result
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }

    public static String findLongestWordOfString(String str) {

        if (str.isEmpty()) {
            return "";
        }

        String[] arrString = str.split(" ");
        int longestIndex = -1;
        int length = 0;

        for (int i = 0; i < arrString.length; i++) {
            if (length < arrString[i].length()) {
                length = arrString[i].length();
                longestIndex = i;
            }
        }

        return longestIndex != -1 ? arrString[longestIndex] : "";
    }
}

// Find the Longest Word in a String
// Input: "I love programming"
// Output: "programming"
/*
------Output------------

Input: "I love programming"
Output: programming

Input: ""
Output: 

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

 */
