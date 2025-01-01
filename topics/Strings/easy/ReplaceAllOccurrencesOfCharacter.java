
class ReplaceAllOccurrencesOfCharacter {

    public static void main(String[] args) {
        // Input string
        String maString = "hello";
        String targetString = "l";
        String replecement = "x";

        // Check if the string contains only alphabets
        String result = containsOnlyAlphabets(maString, targetString, replecement);

        // Output the result
        System.out.println("Input: \"" + maString+"\" \""+ targetString + "\" \"" +replecement+"\"");
        System.out.println("Output: " + result);
    }

    public static String containsOnlyAlphabets(String str, String targetString, String replecement) {
        return str.replace(targetString, replecement);
    }
}


/*
------Output------------

Input: "hello" "l" "x"
Output: hexxo

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/