
import java.util.LinkedHashMap;
import java.util.Map;

class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // Input string
        String input = "swiss";

        char result = findFirstNonRepeatingCharacter(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        // LinkedHashMap to store character counts in insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

}


/*
------Output------------

First non-repeating character: w

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/
