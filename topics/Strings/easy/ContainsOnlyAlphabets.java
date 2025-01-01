
class ContainsOnlyAlphabets {

    public static void main(String[] args) {
        // Input string
        String input = "hello123"; 

        // Check if the string contains only alphabets
        boolean result = containsOnlyAlphabets(input);

        // Output the result
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result);
    }

    public static boolean containsOnlyAlphabets(String str) {
        if (str.isEmpty()) {
           return false;
       }
       for (char c : str.toCharArray()) {
           if (!Character.isAlphabetic(c)) {
               return false;
           }
       }
        return true;
    }
}


/*
------Output------------

Input: "hello"
Output: true

Input: "hello123"
Output: false

Input: "hello#*"
Output: false

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/