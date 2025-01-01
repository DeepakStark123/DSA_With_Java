
import java.util.LinkedHashMap;
import java.util.Map;

class FrequencyOfCharacters {

    public static void main(String[] args) {
        String input = "apple"; // Input string
        int result = frequencyOfCharacters(input);
        System.out.println("Result: " + result);
    }

    public static int frequencyOfCharacters(String str) {
        Map<Character, Integer> hashMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getKey() == 'p') {
                return entry.getValue();
            }
        }
        return 0;
    }

}

/*
------Output------------

Result: 2

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/
