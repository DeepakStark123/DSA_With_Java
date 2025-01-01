class CheckNumericString {
   public static void main(String[] args) {
       // Test cases
       String test1 = "12345";   // Expected: true
       String test2 = "12a45";   // Expected: false
       String test3 = "";        // Expected: false

       // Test the method
       System.out.println("Input: \"" + test1 + "\", Output: " + checkNumericString(test1));
       System.out.println("Input: \"" + test2 + "\", Output: " + checkNumericString(test2));
       System.out.println("Input: \"" + test3 + "\", Output: " + checkNumericString(test3));
   }

   public static boolean checkNumericString(String str) {
       if (str.isEmpty()) {
           return false;
       }
       for (char c : str.toCharArray()) {
           if (!Character.isDigit(c)) {
               return false;
           }
       }
       return true;
   }
}


/*
------Output------------

Input: "12345", Output: true
Input: "12a45", Output: false
Input: "", Output: false

------Time-And-Space-Complexity------------
Time Complexity: 
Space Complexity: 

*/