import java.util.LinkedHashMap;

class FindMostFrequentCharacter {

    public static void main(String[] args) {
        String str = "apple";
        Character res = findMostFrequentCharacter(str);
        System.out.println("Input: " + str);
        System.out.println("Output: " + res);
    }

    public static Character findMostFrequentCharacter(String str) {
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Counts: " + charCountMap);

        // Find the character with the maximum frequency
        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (var entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}
