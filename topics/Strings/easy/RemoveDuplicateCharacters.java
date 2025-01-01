import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicateCharacters {
   public static void main(String[] args) {
       // Input string
       String input = "programming";
       String result = removeDuplicateCharacters(input);
       System.out.println("Result: " + result);
   }

   public static String removeDuplicateCharacters(String str) {
       Set<Character> seen = new LinkedHashSet<>();
       StringBuilder result = new StringBuilder();
       // Count occurrences of each character
       for (char c : str.toCharArray()) {
           seen.add(c);
       }
       for (char c : seen) {
           result.append(c);
       }
       return result.toString();
   }

}

/*
------Output------------

Result: progamin

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/